package com.reacompany.reaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class LuchadorActivity extends MainActivity {

    private EditText edtNombre;
    private EditText edtCat;
    private Button btnClonar;
    private GridView grvLuchador;

    private ArrayList<Luchador> luchadores;
    private Luchador luchador;
    private LuchadorAdapter Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luchador);

        edtNombre=(EditText)findViewById(R.id.edt_nombre);
        edtCat=(EditText)findViewById(R.id.edt_cat);
        btnClonar=(Button)findViewById(R.id.btn_clonar);
        grvLuchador=(GridView)findViewById(R.id.grv_luchador);

        luchadores = new ArrayList<Luchador>();
        luchador = new Luchador();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                luchador.setCategoria(edtCat.getText().toString());
                luchador.setNombre(edtNombre.getText().toString());

                Luchador clon = (Luchador) luchador.clonar();
                luchadores.add(clon);
                Adapter = new LuchadorAdapter(LuchadorActivity.this, luchadores);
                grvLuchador.setAdapter(Adapter);
            }
        });
    }
}
