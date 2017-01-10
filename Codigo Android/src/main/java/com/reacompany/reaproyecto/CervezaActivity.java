package com.reacompany.reaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CervezaActivity extends MainActivity {

    private EditText edtMar;
    private EditText edtTipo;
    private EditText edtPre;
    private Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerveza);

        edtMar = (EditText)findViewById(R.id.edt_mar);
        edtTipo = (EditText)findViewById(R.id.edt_tipo);
        edtPre =(EditText)findViewById(R.id.edt_pre);
        btnGuardar = (Button)findViewById(R.id.btn_guardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cerveza cerveza = Cerveza.getCerveza();
                cerveza.setMarca(edtMar.getText().toString());
                cerveza.setTipo(edtTipo.getText().toString());
                cerveza.setPrecio(Integer.parseInt(edtPre.getText().toString()));

                Toast.makeText(CervezaActivity.this, "Cerveza"
                                + "\nMarca: " + cerveza.getMarca()
                                + "\nTipo: " + cerveza.getTipo()
                                + "\nPrecio: " + cerveza.getPrecio(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
