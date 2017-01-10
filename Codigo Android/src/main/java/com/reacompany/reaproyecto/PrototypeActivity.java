package com.reacompany.reaproyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class PrototypeActivity extends MainActivity {

    private EditText edtNombre;
    private EditText edtPeso;
    private Button btnClonar;
    private GridView grvBorrego;

    private ArrayList<Borrego> borregos;
    private Borrego borrego;
    private BorregoAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        edtNombre=(EditText)findViewById(R.id.edt_nombre);
        edtPeso=(EditText)findViewById(R.id.edt_peso);
        btnClonar=(Button)findViewById(R.id.btn_clonar);
        grvBorrego=(GridView)findViewById(R.id.grv_borrego);

        borregos = new ArrayList<Borrego>();
        borrego = new Borrego();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borrego.setNumero(Integer.parseInt(edtPeso.getText().toString()));
                borrego.setNombre(edtNombre.getText().toString());

                Borrego clon = (Borrego) borrego.clonar();
                borregos.add(clon);
                Adapter = new BorregoAdapter(PrototypeActivity.this, borregos);
                grvBorrego.setAdapter(Adapter);
            }
        });
    }
}
