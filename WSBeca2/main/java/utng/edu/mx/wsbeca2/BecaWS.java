package utng.edu.mx.wsbeca2;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.MarshalFloat;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpResponseException;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by MAnuel on 30/03/2017.
 */

public class BecaWS extends AppCompatActivity implements View.OnClickListener {
    private EditText etPersona;
    private EditText etPersonal;
    private EditText etTipo;
    private EditText etCantidad;
    private Button btGuardar;
    private Button btListar;
    private Beca beca = null;
    final String NAMESPACE =
            "http://ws.utng.edu.mx";
    final SoapSerializationEnvelope envelope =
            new SoapSerializationEnvelope(SoapEnvelope.VER11);
    static String URL =
            "http://192.168.24.132:8080/WSMovie/services/BecasWS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beca_ws);
        components();
    }

    private void components() {
        etPersona = (EditText) findViewById(R.id.et_persona);
        etPersonal = (EditText) findViewById(R.id.et_personal);
        etTipo = (EditText) findViewById(R.id.et_tipo);
        etCantidad = (EditText) findViewById(R.id.et_cantidad);
        btGuardar = (Button) findViewById(R.id.bt_save);
        btListar = (Button) findViewById(R.id.bt_list);
        btGuardar.setOnClickListener(this);
        btListar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_consume_w, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        String persona = etPersona.getText().toString();
        String personal = etPersonal.getText().toString();
        String tipo = etTipo.getText().toString();
        String cantidad = etCantidad.getText().toString();


        if (v.getId() == btGuardar.getId()) {
            if (persona != null && !persona.isEmpty() &&
                    persona!= null && !personal.isEmpty() &&
                    personal != null && !tipo.isEmpty() &&
                    tipo != null && !cantidad.isEmpty() &&
                    cantidad != null && !cantidad.isEmpty()) {
                try {
                    if (getIntent().getExtras().getString("accion")
                            .equals("modificar")) {
                        updateBeca tarea = new updateBeca();
                        tarea.execute();

                    }

                } catch (Exception e) {
                    //Cuando no se haya mandado una accion por defecto es insertar.
                    InsertBeca tarea = new InsertBeca();
                    tarea.execute();
                }
            } else {
                Toast.makeText(this, "llenar todos los campos", Toast.LENGTH_LONG).show();
            }

        }
        if (btListar.getId() == v.getId()) {
            startActivity(new Intent(BecaWS.this, ListBeca.class));
        }
    }//fin conClick

    private void cleanEditTex() {
        etPersona.setText("");
        etPersonal.setText("");
        etTipo.setText("");
        etCantidad.setText("");
    }


    private class InsertBeca extends
            AsyncTask<String, Integer, Boolean> {

        @Override
        protected Boolean doInBackground(String... params) {
            boolean result = true;
            final String METHOD_NAME = "addBeca";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

            SoapObject request =
                    new SoapObject(NAMESPACE, METHOD_NAME);

            beca = new Beca();
            beca.setProperty(0, 0);
            obtenerDatos();

            PropertyInfo info = new PropertyInfo();
            info.setName("beca");
            info.setValue(beca);
            //DUDA EN ESTA LINEA
            info.setType(beca.getClass());
            request.addProperty(info);
            envelope.setOutputSoapObject(request);
            envelope.addMapping(NAMESPACE, "Beca", Beca.class);

            /* Para serializar flotantes y otros tipos no cadenas o enteros*/
            MarshalFloat mf = new MarshalFloat();
            mf.register(envelope);

            HttpTransportSE transporte = new HttpTransportSE(URL);
            try {
                transporte.call(SOAP_ACTION, envelope);
                SoapPrimitive response =
                        (SoapPrimitive) envelope.getResponse();
                String res = response.toString();
                if (!res.equals("1")) {
                    result = false;
                }

            } catch (Exception e) {
                Log.e("Error ", e.getMessage());
                result = false;
            }

            return result;
        }

        @Override
        protected void onPostExecute(Boolean result) {
            if (result) {
                cleanEditTex();
                Toast.makeText(getApplicationContext(),
                        "Registro exitoso.",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "Error al insertar.",
                        Toast.LENGTH_SHORT).show();

            }
        }
    }//fin tarea insertar

    private class updateBeca extends
            AsyncTask<String, Integer, Boolean> {

        protected Boolean doInBackground(String... params) {

            boolean result = true;

            final String METHOD_NAME = "editBeca";
            final String SOAP_ACTION = NAMESPACE + "/" + METHOD_NAME;

            SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);

            beca = new Beca();
            beca.setProperty(0, getIntent().getExtras().getString("valor0"));
            obtenerDatos();

            PropertyInfo info = new PropertyInfo();
            info.setName("beca");
            info.setValue(beca);
            info.setType(beca.getClass());

            request.addProperty(info);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                    SoapEnvelope.VER11);

            envelope.setOutputSoapObject(request);

            envelope.addMapping(NAMESPACE, "Beca", beca.getClass());

            MarshalFloat mf = new MarshalFloat();
            mf.register(envelope);

            HttpTransportSE transporte = new HttpTransportSE(URL);

            try {
                transporte.call(SOAP_ACTION, envelope);
               //MODIFIQUE ESTA LINEAA
                SoapPrimitive response =
                        (SoapPrimitive) envelope.getResponse();
                String res = response.toString();
                if (!res.equals("1")) {
                    result = false;
                }

            } catch (HttpResponseException e) {
                Log.e("Error HTTP", e.toString());
            } catch (IOException e) {
                Log.e("Error IO", e.toString());
            } catch (XmlPullParserException e) {
                Log.e("Error XmlPullParser", e.toString());
            }

            return result;

        }

        protected void onPostExecute(Boolean result) {

            if (result) {
                Toast.makeText(getApplicationContext(), "Actualizado OK",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Error al actualizar",
                        Toast.LENGTH_SHORT).show();

            }
        }
    }

    private void obtenerDatos() {
        beca.setProperty(1, etPersona.getText().toString());
        beca.setProperty(2, etPersonal.getText().toString());
        beca.setProperty(3, Integer.parseInt(etTipo.getText().toString()));
        beca.setProperty(4, Integer.parseInt(etCantidad.getText().toString()));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle datosRegreso = this.getIntent().getExtras();
        try {

            etPersona.setText(datosRegreso.getString("valor1"));
            etPersonal.setText(datosRegreso.getString("valor2"));
            etTipo.setText(datosRegreso.getString("valor3"));
            etCantidad.setText(datosRegreso.getString("valor4"));
        } catch (Exception e) {
            Log.e("Error al Recargar", e.toString());
        }

    }
}
