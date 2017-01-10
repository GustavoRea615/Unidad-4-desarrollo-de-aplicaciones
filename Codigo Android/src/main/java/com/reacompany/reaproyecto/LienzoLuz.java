package com.reacompany.reaproyecto;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Martha on 01/01/2017.
 */
public class LienzoLuz extends View {

    private ControlLuz estado;
    private Luz luz;

    public LienzoLuz(Context context, ControlLuz estado, Luz luz){
        super(context);
        this.estado = estado;
        this.luz = luz;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado!=null&& luz !=null){
            luz.setCanvas(canvas);
            estado.presionarSwitch(luz , canvas);
        }
    }

    public ControlLuz getEstado() {
        return estado;
    }

    public void setEstado(ControlLuz estado) {
        this.estado = estado;
    }
}
