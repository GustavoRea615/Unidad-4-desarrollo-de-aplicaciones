package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Martha on 13/12/2016.
 */
public class Pato implements Zoologico {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint=new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#CCCCCC"));

        path.moveTo(125, 125);
        path.lineTo(125, 275);
        path.lineTo(187,275);
        path.lineTo(187,350);
        path.lineTo(233,350);
        path.lineTo(233,275);
        path.lineTo(300,275);
        path.lineTo(300,125);
        path.lineTo(275,125);
        path.lineTo(275,100);
        path.lineTo(150,100);
        path.lineTo(150,125);
        path.lineTo(125,125);


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

        path3.moveTo(250, 150);//1
        path3.lineTo(250, 175);//2
        path3.lineTo(275, 175);//3
        path3.lineTo(275, 150);//4
        path3.lineTo(250, 150);//5

        path3.moveTo(100, 215);//1
        path3.lineTo(100, 235);//2
        path3.lineTo(325, 235);//3
        path3.lineTo(325, 215);//4
        path3.lineTo(100, 215);//5

        path3.close();

        canvas.drawPath(path3, paint3);

        Paint paint2 = new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor("#FFFF00"));

        path2.moveTo(100, 200);//1
        path2.lineTo(100, 250);//2
        path2.lineTo(325, 250);//3
        path2.lineTo(325, 200);//4
        path2.lineTo(100, 200);//5

        path2.close();

        canvas.drawPath(path2, paint2);


        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.parseColor("#999999"));

        path4.moveTo(175, 85);//1
        path4.lineTo(175, 100);//2
        path4.lineTo(250, 100);//3
        path4.lineTo(250, 85);//4
        path4.lineTo(175, 85);//5

        path4.close();

        canvas.drawPath(path4, paint4);

        Paint paint5 = new Paint();
        Path path5 = new Path();
        paint5.setStyle(Paint.Style.FILL);
        paint5.setColor(Color.BLACK);


        path5.moveTo(100, 224);//1
        path5.lineTo(100, 226);//2
        path5.lineTo(325, 226);//3
        path5.lineTo(325, 224);//4
        path5.lineTo(100, 224);//5

        path5.close();

        canvas.drawPath(path5, paint5);
    }
}
