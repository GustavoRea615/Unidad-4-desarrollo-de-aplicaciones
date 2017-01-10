package com.reacompany.reaproyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CarcelActivity extends MainActivity {

    private LinearLayout layCarcel;
    private ImageButton btnSwitch;
    private LienzoCarcel lienzoCarcel;

    private ApagadoCarcel estadoInicial;
    private Carcel carcel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carcel);

        layCarcel = (LinearLayout) findViewById(R.id.lay_carcel);
        btnSwitch = (ImageButton)findViewById(R.id.btn_switch);
        estadoInicial = new ApagadoCarcel();
        carcel = new Carcel(estadoInicial);
        lienzoCarcel = new LienzoCarcel(this, estadoInicial, carcel);
        layCarcel.addView(lienzoCarcel);

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzoCarcel.setEstado(carcel.getEstado());
                carcel.presionarBoton();
                lienzoCarcel.invalidate();

                Toast.makeText(CarcelActivity.this, "GRRRR¡¡¡",
                        Toast.LENGTH_SHORT).show();


            }
        });
    }
}
