package com.reacompany.reaproyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class
        StateActivity extends MainActivity {

    private LinearLayout layState;
    private ImageButton btnSwitch;
    private LienzoState lienzoState;

    private ApagadoLeon estadoInicial;
    private LeonState leonState;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        layState = (LinearLayout) findViewById(R.id.lay_state);
        btnSwitch = (ImageButton)findViewById(R.id.btn_switch);
        estadoInicial = new ApagadoLeon();
        leonState = new LeonState(estadoInicial);
        lienzoState = new LienzoState(this, estadoInicial, leonState);
        layState.addView(lienzoState);

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzoState.setEstado(leonState.getEstado());
                leonState.presionarBoton();
                lienzoState.invalidate();

                Toast.makeText(StateActivity.this, "Gracias Men¡¡¡",
                        Toast.LENGTH_SHORT).show();


            }
        });


    }
}

