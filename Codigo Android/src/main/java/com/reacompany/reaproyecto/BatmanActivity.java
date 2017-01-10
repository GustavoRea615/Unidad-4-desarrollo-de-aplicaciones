package com.reacompany.reaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class BatmanActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtGen;
    private Button btnClonar;
    private GridView grvBatman;

    private ArrayList<Batman> batmans;
    private Batman batman;
    private BatmanAdapter Adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batman);

        edtNombre=(EditText)findViewById(R.id.edt_nombre);
        edtGen=(EditText)findViewById(R.id.edt_gen);
        btnClonar=(Button)findViewById(R.id.btn_clonar);
        grvBatman=(GridView)findViewById(R.id.grv_batman);

        batmans = new ArrayList<Batman>();
        batman = new Batman();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                batman.setGeneracion(Integer.parseInt(edtGen.getText().toString()));
                batman.setNombre(edtNombre.getText().toString());

                Batman clon = (Batman) batman.clonar();
                batmans.add(clon);
                Adapter = new BatmanAdapter(BatmanActivity.this, batmans);
                grvBatman.setAdapter(Adapter);
            }
        });
    }
    }
