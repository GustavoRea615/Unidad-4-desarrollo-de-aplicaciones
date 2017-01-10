package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Martha on 14/12/2016.
 */
public class Leon implements Zoologico {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint=new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#663300"));

        path.moveTo(75, 150);
        path.lineTo(75, 300);
        path.lineTo(100,300);
        path.lineTo(100, 375);
        path.lineTo(125, 375);
        path.lineTo(125, 400);
        path.lineTo(175,400);
        path.lineTo(175,425);
        path.lineTo(225,425);
        path.lineTo(225,450);
        path.lineTo(250,450);
        path.lineTo(250,475);
        path.lineTo(275,475);
        path.lineTo(275,450);
        path.lineTo(300,450);
        path.lineTo(300,425);
        path.lineTo(350,425);
        path.lineTo(350,400);
        path.lineTo(400,400);
        path.lineTo(400,375);
        path.lineTo(425,375);

        path.lineTo(425,300);
        path.lineTo(450,300);
        path.lineTo(450,150);
        path.lineTo(425,150);
        path.lineTo(425,125);
        path.lineTo(375,125);
        path.lineTo(375,100);
        path.lineTo(325,100);
        path.lineTo(325,75);
        path.lineTo(200,75);
        path.lineTo(200,100);
        path.lineTo(150,100);
        path.lineTo(150,125);
        path.lineTo(100,125);
        path.lineTo(100,150);
        path.lineTo(75,150);


        path.close();

        canvas.drawPath(path,paint);

        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.parseColor("#FFFF66"));

        path3.moveTo(150, 225);//1
        path3.lineTo(150, 325);//2
        path3.lineTo(175, 325);//3
        path3.lineTo(175, 350);//4
        path3.lineTo(200, 350);//5
        path3.lineTo(200, 375);//2
        path3.lineTo(325, 375);//3
        path3.lineTo(325, 350);//4
        path3.lineTo(350, 350);//5
        path3.lineTo(350, 325);//2
        path3.lineTo(375, 325);//3
        path3.lineTo(375, 225);//4
        path3.lineTo(350, 225);//5
        path3.lineTo(350, 200);//2
        path3.lineTo(325, 200);//3
        path3.lineTo(325, 175);//4
        path3.lineTo(200, 175);//5
        path3.lineTo(200, 200);//2
        path3.lineTo(175, 200);//3
        path3.lineTo(175, 225);//4
        path3.lineTo(150, 225);//5

        path3.moveTo(100, 150);//1
        path3.lineTo(100, 200);//2
        path3.lineTo(125, 200);//3
        path3.lineTo(125, 175);//4
        path3.lineTo(150, 175);//5
        path3.lineTo(150, 150);//2
        path3.lineTo(100, 150);//3

        path3.moveTo(425, 150);//1
        path3.lineTo(425, 200);//2
        path3.lineTo(400, 200);//3
        path3.lineTo(400, 175);//4
        path3.lineTo(375, 175);//5
        path3.lineTo(375, 150);//2
        path3.lineTo(425, 150);//3

        path3.close();

        canvas.drawPath(path3, paint3);

        Paint paint2 = new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor("#FFFFFF"));

        path2.moveTo(225, 275);//1
        path2.lineTo(225, 325);//2
        path2.lineTo(300, 325);//3
        path2.lineTo(300, 275);//4
        path2.lineTo(225, 275);//5

        path2.close();

        canvas.drawPath(path2, paint2);


        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.BLACK);

        path4.moveTo(175, 250);//1
        path4.lineTo(175, 275);//2
        path4.lineTo(200, 275);//3
        path4.lineTo(200, 250);//4
        path4.lineTo(175, 250);//5

        path4.moveTo(325, 250);//1
        path4.lineTo(325, 275);//2
        path4.lineTo(350, 275);//3
        path4.lineTo(350, 250);//4
        path4.lineTo(325, 250);//5

        path4.moveTo(250, 275);//1
        path4.lineTo(250, 300);//2
        path4.lineTo(275, 300);//3
        path4.lineTo(275, 275);//4
        path4.lineTo(250, 275);//5

        path4.close();

        canvas.drawPath(path4, paint4);

       /* Paint paint5 = new Paint();
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
        */
    }
}
