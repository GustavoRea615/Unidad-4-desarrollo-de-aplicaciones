package com.reacompany.reaproyecto;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Martha on 01/01/2017.
 */
public class LienzoLago extends View {

    private ControlLago estado;
    private Lago lago;

    public LienzoLago(Context context, ControlLago estado, Lago lago){
        super(context);
        this.estado = estado;
        this.lago = lago;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado!=null&& lago !=null){
            lago.setCanvas(canvas);
            estado.presionarSwitch(lago , canvas);
        }
    }

    public ControlLago getEstado() {
        return estado;
    }

    public void setEstado(ControlLago estado) {
        this.estado = estado;
    }
}
