package com.reacompany.reaproyecto;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by eduardo on 14/09/2016.
 */
public class Lienzo extends View {
    private Zoologico zoologico;

    public Lienzo(Context context, Zoologico zoologico){
        super(context);
        this.zoologico = zoologico;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (zoologico !=null){
            zoologico.dibujar(canvas);
        }
    }

    public Zoologico getZoologico() {
        return zoologico;
    }

    public void setZoologico(Zoologico zoologico) {
        this.zoologico = zoologico;
    }
}
