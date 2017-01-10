package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;


public class Conejo implements Zoologico {

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint=new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#8D9479"));

        path.moveTo(100,175);
        path.lineTo(100,250);
        path.lineTo(150,250);
        path.lineTo(150,350);
        path.lineTo(200,350);
        path.lineTo(200,325);
        path.lineTo(250,325);
        path.lineTo(250,350);
        path.lineTo(400,350);
        path.lineTo(400,325);
        path.lineTo(350,325);
        path.lineTo(350,250);
        path.lineTo(450,250);
        path.lineTo(450,250);
        path.lineTo(410,100);
        path.lineTo(410,175);
        path.lineTo(390,175);
        path.lineTo(390,100);
        path.lineTo(350,100);
        path.lineTo(350,200);
        path.lineTo(150,200);
        path.lineTo(150,150);
        path.lineTo(100,175);

        path.close();

        canvas.drawPath(path,paint);
    }
}
