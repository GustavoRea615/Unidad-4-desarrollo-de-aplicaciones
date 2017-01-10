package com.reacompany.reaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LagoActivity extends MainActivity {

    private LinearLayout layLago;
    private ImageButton btnSwitch;
    private LienzoLago lienzoLago;

    private ApagadoLago estadoInicial;
    private Lago lago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lago);

        layLago = (LinearLayout) findViewById(R.id.lay_lago);
        btnSwitch = (ImageButton)findViewById(R.id.btn_switch);
        estadoInicial = new ApagadoLago();
        lago = new Lago(estadoInicial);
        lienzoLago = new LienzoLago(this, estadoInicial, lago);
        layLago.addView(lienzoLago);

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzoLago.setEstado(lago.getEstado());
                lago.presionarBoton();
                lienzoLago.invalidate();

                Toast.makeText(LagoActivity.this, "Glu Glu Glu (En casa)",
                        Toast.LENGTH_SHORT).show();


            }
        });
    }
}
