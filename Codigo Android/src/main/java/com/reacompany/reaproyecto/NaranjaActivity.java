package com.reacompany.reaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class NaranjaActivity extends MainActivity {

    private EditText edtEst;
    private EditText edtSab;
    private Button btnClonar;
    private GridView grvNaranja;

    private ArrayList<Naranja> naranjas;
    private Naranja naranja;
    private NaranjaAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naranja);

        edtEst=(EditText)findViewById(R.id.edt_est);
        edtSab=(EditText)findViewById(R.id.edt_sab);
        btnClonar=(Button)findViewById(R.id.btn_clonar);
        grvNaranja=(GridView)findViewById(R.id.grv_naranja);

        naranjas = new ArrayList<Naranja>();
        naranja = new Naranja();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                naranja.setSabor(edtSab.getText().toString());
                naranja.setEstado(edtEst.getText().toString());

                Naranja clon = (Naranja) naranja.clonar();
                naranjas.add(clon);
                Adapter = new NaranjaAdapter(NaranjaActivity.this, naranjas);
                grvNaranja.setAdapter(Adapter);
            }
        });

    }
}
