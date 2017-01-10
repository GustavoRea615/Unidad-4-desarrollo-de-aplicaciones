package com.reacompany.reaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class FactoryActivity extends MainActivity {

    private EditText edtAnimal;
    private Button btnBuscar;
    private LinearLayout layPrincipal;
    private Lienzo lienzo;
    private Zoologico zoologico;
    private ZoologicoFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        edtAnimal=(EditText)findViewById(R.id.edt_animal);
        btnBuscar=(Button)findViewById(R.id.btn_buscar);
        layPrincipal=(LinearLayout)findViewById(R.id.lay_principal);

        lienzo = new Lienzo(FactoryActivity.this, zoologico);
        layPrincipal.addView(lienzo);
        factory = new ZoologicoFactory();

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoologico = factory.crearAnimal(edtAnimal.getText().toString());
                lienzo.setZoologico(zoologico);
                lienzo.invalidate();
            }
        });
    }
}
