package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Martha on 01/01/2017.
 */
public class ApagadoLuz extends ControlLuz{
    @Override
    public void presionarSwitch(Luz luz, Canvas canvas) {
        luz.setEstado(new EncendidoLuz());


        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.BLACK);

        path3.moveTo(137, 125);//1
        path3.lineTo(137, 150);//2
        path3.lineTo(162, 150);//3
        path3.lineTo(162, 125);//4
        path3.lineTo(137, 125);//5

        path3.moveTo(212, 125);//1
        path3.lineTo(212, 150);//2
        path3.lineTo(237, 150);//3
        path3.lineTo(237, 125);//4
        path3.lineTo(212, 125);//5

        path3.moveTo(182, 160);//1
        path3.lineTo(182, 165);//2
        path3.lineTo(192, 165);//3
        path3.lineTo(192, 160);//4
        path3.lineTo(182, 160);//5

        path3.moveTo(163, 175);//1
        path3.lineTo(163, 175);//1
        path3.lineTo(175, 185);//2
        path3.lineTo(187, 175);//3
        path3.lineTo(187, 165);//4
        path3.lineTo(187, 175);//5
        path3.lineTo(200, 185);//3
        path3.lineTo(212, 175);//4

        path3.close();

        canvas.drawPath(path3, paint3);


    }

}
