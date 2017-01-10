package com.reacompany.reaproyecto;

import android.graphics.Canvas;

/**
 * Created by qas on 6/09/16.
 */
public class LeonState {
    private ControlComida estado;
    private Canvas canvas;

    public LeonState(ControlComida estado){
        this.estado = estado;
    }

    public void presionarBoton(){
        estado.presionarSwitch(this, canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public ControlComida getEstado() {
        return estado;
    }

    public void setEstado(ControlComida estado) {
        this.estado = estado;
    }

}
