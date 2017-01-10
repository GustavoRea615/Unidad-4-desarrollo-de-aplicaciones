package com.reacompany.reaproyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarFactory(View view) {
        Intent i = new Intent(this, FactoryActivity.class );
        startActivity(i);
    }

    public void lanzarState(View view) {
        Intent i = new Intent(this, StateActivity.class );
        startActivity(i);
    }

    public void lanzarState2(View view) {
        Intent i = new Intent(this, CarcelActivity.class );
        startActivity(i);
    }

    public void lanzarState3(View view) {
        Intent i = new Intent(this, LagoActivity.class );
        startActivity(i);
    }

    public void lanzarState4(View view) {
        Intent i = new Intent(this, LuzActivity.class );
        startActivity(i);
    }


    public void lanzarPrototype(View view) {
        Intent i = new Intent(this, PrototypeActivity.class );
        startActivity(i);
    }

    public void lanzarPrototype2(View view) {
        Intent i = new Intent(this, LuchadorActivity.class );
        startActivity(i);
    }

    public void lanzarPrototype3(View view) {
        Intent i = new Intent(this, BatmanActivity.class );
        startActivity(i);
    }

    public void lanzarPrototype4(View view) {
        Intent i = new Intent(this, NaranjaActivity.class );
        startActivity(i);
    }

    public void lanzarSingleton(View view) {
        Intent i = new Intent(this, SingletonActivity.class );
        startActivity(i);
    }

    public void lanzarSingleton2(View view) {
        Intent i = new Intent(this, WindowsActivity.class );
        startActivity(i);
    }

    public void lanzarSingleton3(View view) {
        Intent i = new Intent(this, CervezaActivity.class );
        startActivity(i);
    }

    public void lanzarSingleton4(View view) {
        Intent i = new Intent(this, CalculadoraActivity.class );
        startActivity(i);
    }

    public void lanzarProfe(View view) {
        Intent i = new Intent(this, ProfeActivity.class );
        startActivity(i);
    }

}
