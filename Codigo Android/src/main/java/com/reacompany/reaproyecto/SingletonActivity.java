package com.reacompany.reaproyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SingletonActivity extends MainActivity {

    private EditText edtNom;
    private EditText edtEdad;
    private EditText edtPeso;
    private Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        edtNom = (EditText)findViewById(R.id.edt_nom);
        edtEdad = (EditText)findViewById(R.id.edt_edad);
        edtPeso=(EditText)findViewById(R.id.edt_peso);
        btnGuardar = (Button)findViewById(R.id.btn_guardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Burro burro= Burro.getBurro();
                burro.setNombre(edtNom.getText().toString());
                burro.setEdad(Integer.parseInt(edtEdad.getText().toString()));
                burro.setPeso(Integer.parseInt(edtPeso.getText().toString()));

                Toast.makeText(SingletonActivity.this, "Burro"
                                + "\nNombre: " + burro.getNombre()
                                + "\nEdad: " + burro.getEdad()
                                + "\nPeso: " + burro.getPeso(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
