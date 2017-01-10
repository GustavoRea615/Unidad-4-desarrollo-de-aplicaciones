package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Martha on 01/01/2017.
 */
public class ApagadoLago extends ControlLago {
    @Override
    public void presionarSwitch(Lago lago, Canvas canvas) {
        lago.setEstado(new EncendidoLago());

        Paint paint=new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#638092"));

        path.moveTo(100, 85);
        path.lineTo(100, 150);
        path.lineTo(112,150);
        path.lineTo(112,200);
        path.lineTo(75,200);
        path.lineTo(75,275);
        path.lineTo(375,275);
        path.lineTo(375,200);
        path.lineTo(338,200);
        path.lineTo(338,150);
        path.lineTo(350,150);
        path.lineTo(350,85);
        path.lineTo(300,85);


        path.lineTo(300,100);
        path.lineTo(150,100);
        path.lineTo(150,85);
        path.lineTo(100,85);

        path.close();

        canvas.drawPath(path,paint);

        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.BLACK);

        path3.moveTo(150, 150);//1
        path3.lineTo(150, 175);//2
        path3.lineTo(175, 175);//3
        path3.lineTo(175, 150);//4
        path3.lineTo(150, 150);//5

        path3.moveTo(275, 150);//1
        path3.lineTo(275, 175);//2
        path3.lineTo(300, 175);//3
        path3.lineTo(300, 150);//4
        path3.lineTo(275, 150);//5

        path3.close();

        canvas.drawPath(path3, paint3);

        Paint paint2 = new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor("#000066"));

        path2.moveTo(175, 200);//1
        path2.lineTo(175, 215);//2
        path2.lineTo(215, 215);//3
        path2.lineTo(215, 200);//4
        path2.lineTo(175, 200);//5

        path2.moveTo(235, 200);//1
        path2.lineTo(235, 215);//2
        path2.lineTo(275, 215);//3
        path2.lineTo(275, 200);//4
        path2.lineTo(235, 200);//5

        path2.close();

        canvas.drawPath(path2, paint2);


        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.parseColor("#FFFFFF"));

        path4.moveTo(125, 275);//1
        path4.lineTo(125, 290);//2
        path4.lineTo(200, 290);//3
        path4.lineTo(200, 275);//4
        path4.lineTo(125, 275);//5

        path4.moveTo(250, 275);//1
        path4.lineTo(250, 290);//2
        path4.lineTo(325, 290);//3
        path4.lineTo(325, 275);//4
        path4.lineTo(250, 275);//5

        path4.close();

        canvas.drawPath(path4, paint4);
    }
}
