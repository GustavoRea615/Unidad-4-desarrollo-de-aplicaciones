package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Martha on 01/01/2017.
 */
public class EncendidoLuz extends ControlLuz{
    @Override
    public void presionarSwitch(Luz luz, Canvas canvas) {
        luz.setEstado(new ApagadoLuz());

//luz de fondo
        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.YELLOW);

        path4.moveTo(100,15);//1
        path4.lineTo(0,250);//2
        path4.lineTo(375,250);//3
        path4.lineTo(275,15);//4
        path4.lineTo(100,15);//5

        path4.close();

        canvas.drawPath(path4,paint4);


    Paint paint = new Paint();
    Path path = new Path();
    paint.setStyle(Paint.Style.FILL);
    paint.setColor(Color.GRAY);

    path.moveTo(75,100);
    path.lineTo(75,125);
    path.lineTo(100,125);
    path.lineTo(100,150);
    path.lineTo(75,150);
    path.lineTo(75,175);
    path.lineTo(100,175);
    path.lineTo(100,200);
    path.lineTo(125,200);
    path.lineTo(125,225);
    path.lineTo(250,225);


    path.lineTo(250,200);
    path.lineTo(275,200);
    path.lineTo(275,175);
    path.lineTo(300,175);
    path.lineTo(300,150);
    path.lineTo(275,150);
    path.lineTo(275,125);
    path.lineTo(300,125);
    path.lineTo(300,100);
    path.lineTo(275,100);
    path.lineTo(275,25);

    path.lineTo(250,25);
    path.lineTo(250,50);
    path.lineTo(225,50);
    path.lineTo(225,75);
    path.lineTo(150,75);
    path.lineTo(150,50);
    path.lineTo(125,50);
    path.lineTo(125,25);
    path.lineTo(100,25);
    path.lineTo(100,100);
    path.lineTo(75,100);

        //lampara
        path.moveTo(100,0);
        path.lineTo(100,15);
        path.lineTo(275,15);
        path.lineTo(275,0);
        path.lineTo(100,0);


    path.close();

    canvas.drawPath(path,paint);

    Paint paint3 = new Paint();
    Path path3 = new Path();
    paint3.setStyle(Paint.Style.FILL);
    paint3.setColor(Color.BLACK);

    path3.moveTo(137,125);//1
    path3.lineTo(137,150);//2
    path3.lineTo(162,150);//3
    path3.lineTo(162,125);//4
    path3.lineTo(137,125);//5

    path3.moveTo(212,125);//1
    path3.lineTo(212,150);//2
    path3.lineTo(237,150);//3
    path3.lineTo(237,125);//4
    path3.lineTo(212,125);//5

    path3.moveTo(182,160);//1
    path3.lineTo(182,165);//2
    path3.lineTo(192,165);//3
    path3.lineTo(192,160);//4
    path3.lineTo(182,160);//5

    path3.moveTo(163,175);//1
    path3.lineTo(163,175);//1
    path3.lineTo(175,185);//2
    path3.lineTo(187,175);//3
    path3.lineTo(187,165);//4
    path3.lineTo(187,175);//5
    path3.lineTo(200,185);//3
    path3.lineTo(212,175);//4

    path3.close();

    canvas.drawPath(path3,paint3);

    Paint paint2 = new Paint();
    Path path2 = new Path();
    paint2.setStyle(Paint.Style.FILL);
    paint2.setColor(Color.MAGENTA);

    path2.moveTo(112,175);//1
    path2.lineTo(150,175);//2
    path2.lineTo(150,150);//3
    path2.lineTo(112,150);//4
    path2.lineTo(112,175);//5

    path2.moveTo(225,175);//1
    path2.lineTo(263,175);//2
    path2.lineTo(263,150);//3
    path2.lineTo(225,150);//4
    path2.lineTo(225,175);//5

    path2.close();

    canvas.drawPath(path2,paint2);
}
}
