package com.reacompany.reaproyecto;

import android.graphics.Canvas;

/**
 * Created by Martha on 30/12/2016.
 */
public class Carcel {
    private ControlCarcel estado;
    private Canvas canvas;

    public Carcel(ControlCarcel estado){
        this.estado = estado;
    }

    public void presionarBoton(){ estado.presionarSwitch(this, canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public ControlCarcel getEstado() {
        return estado;
    }

    public void setEstado(ControlCarcel estado) { this.estado = estado;
    }
}
