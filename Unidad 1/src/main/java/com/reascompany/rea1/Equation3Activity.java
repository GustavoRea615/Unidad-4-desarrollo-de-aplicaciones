package com.reascompany.rea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Equation3Activity extends AppCompatActivity {

    private EditText editValZ, editValA, editValB, editValX, editValY;


    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation3);

        editValZ= (EditText)findViewById(R.id.editValZ);

        editValA= (EditText)findViewById(R.id.editValA);

        editValB= (EditText)findViewById(R.id.editValB);

        editValX= (EditText)findViewById(R.id.editValX);

        editValY= (EditText)findViewById(R.id.editValY);


        btnGuardar = (Button)findViewById(R.id.buttonCalc);

        final TextView tvResultado = (TextView) findViewById(R.id.TvxResultado);

        btnGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                double aux1 = Double.valueOf(editValZ.getText().toString());

                double aux2 = Double.valueOf(editValA.getText().toString());

                double aux3 = Double.valueOf(editValB.getText().toString());

                double aux4 = Double.valueOf(editValX.getText().toString());

                double aux5 = Double.valueOf(editValY.getText().toString());

                double resultado = ((aux1*aux1*aux1*aux1*aux1*aux1*aux1) + aux2)* (aux3 +(aux4*aux4*aux4)) + (42/aux5) - 3.14;

                tvResultado.setText("" + resultado);



            }
        });

    }
}
