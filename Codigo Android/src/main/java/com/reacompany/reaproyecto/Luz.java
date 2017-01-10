package com.reacompany.reaproyecto;

import android.graphics.Canvas;

/**
 * Created by Martha on 01/01/2017.
 */
public class Luz {
    private ControlLuz estado;
    private Canvas canvas;

    public Luz(ControlLuz estado){
        this.estado = estado;
    }

    public void presionarBoton(){ estado.presionarSwitch(this, canvas);
    }

    public ControlLuz getEstado() {
        return estado;
    }

    public void setEstado(ControlLuz estado) {
        this.estado = estado;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
