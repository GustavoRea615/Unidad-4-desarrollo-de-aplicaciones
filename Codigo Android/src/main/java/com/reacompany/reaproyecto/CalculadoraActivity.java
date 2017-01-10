package com.reacompany.reaproyecto;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraActivity extends ActionBarActivity {

    private EditText edtVal1;
    private EditText edtVal2;

    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        edtVal1= (EditText)findViewById(R.id.edt_val1);
        edtVal2= (EditText)findViewById(R.id.edt_val2);
        btnGuardar = (Button)findViewById(R.id.btn_guardar);

        final TextView tvResultado = (TextView) findViewById(R.id.MessageRes);

        btnGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Calculadora calculadora= Calculadora.getCalculadora();
                int aux1 = Integer.valueOf(edtVal1.getText().toString());
                int aux2 = Integer.valueOf(edtVal2.getText().toString());
                int resultado = aux1 * aux2;
                tvResultado.setText("" + resultado);

                Toast.makeText(CalculadoraActivity.this, "Operacion Realizada",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }
}
