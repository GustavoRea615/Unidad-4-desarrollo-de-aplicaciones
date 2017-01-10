package com.reacompany.reaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LuzActivity extends MainActivity {

    private LinearLayout layLuz;
    private ImageButton btnSwitch;
    private LienzoLuz lienzoLuz;

    private ApagadoLuz estadoInicial;
    private Luz luz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luz);

        layLuz = (LinearLayout) findViewById(R.id.lay_luz);
        btnSwitch = (ImageButton)findViewById(R.id.btn_switch);
        estadoInicial = new ApagadoLuz();
        luz = new Luz(estadoInicial);
        lienzoLuz= new LienzoLuz(this, estadoInicial, luz);
        layLuz.addView(lienzoLuz);

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzoLuz.setEstado(luz.getEstado());
                luz.presionarBoton();
                lienzoLuz.invalidate();

                Toast.makeText(LuzActivity.this, "Me aterra la oscuridad ",
                        Toast.LENGTH_SHORT).show();


            }
        });
    }
}
