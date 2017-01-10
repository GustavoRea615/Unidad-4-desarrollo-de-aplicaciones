package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by eduardo on 14/09/2016.
 */
public class Perro implements Zoologico {
    @Override
    public void dibujar(Canvas canvas) {

        Paint paint = new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#FFDFAA"));

        path.moveTo(50, 250);//1
        path.lineTo(90, 250);//2
        path.lineTo(90, 200);//3
        path.lineTo(110, 200);//4
        path.lineTo(110, 250);//5
        path.lineTo(150, 250);//6
        path.lineTo(150, 200);//7

        path.lineTo(300, 200);//9
        path.lineTo(300, 250);//7
        path.lineTo(340, 250);//10
        //  path.lineTo(340,200);//8
        path.lineTo(340, 200);//9
        path.lineTo(360,200);//7

        path.lineTo(360,250);//10
        // path.lineTo(250,360);//10
        path.lineTo(400,250);//10
        path.lineTo(400,150);//10
        path.lineTo(500,150);//10
        path.lineTo(500,100);//10
        path.lineTo(400,100);//10
        path.lineTo(400,70);//7

        // path.lineTo(360,100);//10
        path.lineTo(360,70);//10

        path.lineTo(360,100);//10
        path.lineTo(340,100);//10
        path.lineTo(340,70);//10
        path.lineTo(300,70);//10
        path.lineTo(300,100);//10
        path.lineTo(50,100);//10
        path.lineTo(50,250);//10
        path.close();

        canvas.drawPath(path,paint);
    }
}
