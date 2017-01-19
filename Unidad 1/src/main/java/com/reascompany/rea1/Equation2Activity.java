package com.reascompany.rea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Equation2Activity extends AppCompatActivity {

    private EditText editValY;
    private EditText editValX;


    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation2);

        editValY= (EditText)findViewById(R.id.editValY);

        editValX= (EditText)findViewById(R.id.editValX);


        btnGuardar = (Button)findViewById(R.id.buttonCalc);

        final TextView tvResultado = (TextView) findViewById(R.id.TvxResultado);

        btnGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int aux1 = Integer.valueOf(editValY.getText().toString());

                int aux2 = Integer.valueOf(editValX.getText().toString());

                int resultado = (aux1*aux1) + (aux2*2) - 3;
                tvResultado.setText("" + resultado);



            }
        });

    }
}
