package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Martha on 11/12/2016.
 */
public class Venado implements Zoologico {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint=new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#993300"));

        path.moveTo(75, 200);
        path.lineTo(75, 225);
        path.lineTo(125,225);
        path.lineTo(125,325);
        path.lineTo(150,325);
        path.lineTo(150,350);
        path.lineTo(175,350);
        path.lineTo(175,375);
        path.lineTo(250,375);

        path.lineTo(250,350);
        path.lineTo(275,350);
        path.lineTo(275,325);
        path.lineTo(300,325);
        path.lineTo(300,225);
        path.lineTo(350,225);
        path.lineTo(350,200);
        path.lineTo(75,200);


        path.close();

        canvas.drawPath(path,paint);

        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.parseColor("#B4B4B4"));

        path3.moveTo(125, 100);//1
        path3.lineTo(125, 150);//2
        path3.lineTo(150, 150);//3
        path3.lineTo(150, 200);//4
        path3.lineTo(175, 200);//5
        path3.lineTo(175, 150);//1
        path3.lineTo(200, 150);//2
        path3.lineTo(200, 100);//3
        path3.lineTo(175, 100);//4
        path3.lineTo(175, 125);//5
        path3.lineTo(150, 125);//1
        path3.lineTo(150, 100);//2
        path3.lineTo(125, 100);//3


        path3.moveTo(225, 100);//1
        path3.lineTo(225, 150);//2
        path3.lineTo(250, 150);//3
        path3.lineTo(250, 200);//4
        path3.lineTo(275, 200);//5
        path3.lineTo(275, 150);//1
        path3.lineTo(300, 150);//2
        path3.lineTo(300, 100);//3
        path3.lineTo(275, 100);//4
        path3.lineTo(275, 125);//5
        path3.lineTo(250, 125);//1
        path3.lineTo(250, 100);//2
        path3.lineTo(225, 100);//3

        path3.close();

        canvas.drawPath(path3, paint3);

        Paint paint2 = new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.BLACK);

        path2.moveTo(150, 250);//1
        path2.lineTo(150, 275);//2
        path2.lineTo(175, 275);//3
        path2.lineTo(175, 250);//4
        path2.lineTo(150, 250);//5

        path2.moveTo(250, 250);//1
        path2.lineTo(250, 275);//2
        path2.lineTo(275, 275);//3
        path2.lineTo(275, 250);//4
        path2.lineTo(250, 250);//5

        path2.moveTo(200, 375);//1
        path2.lineTo(200, 400);//2
        path2.lineTo(225, 400);//3
        path2.lineTo(225, 375);//4
        path2.lineTo(200, 375);//5

        path2.close();

        canvas.drawPath(path2, paint2);


        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.parseColor("#663300"));

        path4.moveTo(100, 225);//1
        path4.lineTo(100, 250);//2
        path4.lineTo(125, 250);//3
        path4.lineTo(125, 225);//4
        path4.lineTo(100, 225);//5

        path4.moveTo(300, 225);//1
        path4.lineTo(300, 250);//2
        path4.lineTo(325, 250);//3
        path4.lineTo(325, 225);//4
        path4.lineTo(300, 225);//5


        path4.close();

        canvas.drawPath(path4, paint4);
    }
}
