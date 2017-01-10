package com.reacompany.reaproyecto;

import android.graphics.Canvas;

/**
 * Created by Martha on 01/01/2017.
 */
public class Lago {
    private ControlLago estado;
    private Canvas canvas;

    public Lago(ControlLago estado){
        this.estado = estado;
    }

    public void presionarBoton(){ estado.presionarSwitch(this, canvas);
    }

    public ControlLago getEstado() {
        return estado;
    }

    public void setEstado(ControlLago estado) {
        this.estado = estado;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
