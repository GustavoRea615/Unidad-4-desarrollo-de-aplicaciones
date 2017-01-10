package com.reacompany.reaproyecto;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Martha on 30/12/2016.
 */
public class LienzoCarcel extends View {

    private ControlCarcel estado;
    private Carcel carcel;

    public LienzoCarcel(Context context, ControlCarcel estado, Carcel carcel){
        super(context);
        this.estado = estado;
        this.carcel = carcel;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado!=null&& carcel !=null){
            carcel.setCanvas(canvas);
            estado.presionarSwitch(carcel , canvas);
        }
    }

    public void setEstado(ControlCarcel estado) {
        this.estado = estado;
    }

    public ControlCarcel getEstado() {
        return estado;
    }

}
