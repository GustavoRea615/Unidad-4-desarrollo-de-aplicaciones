package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Martha on 11/12/2016.
 */
public class Vaca implements Zoologico {
    @Override
    public void dibujar(Canvas canvas) {

        Paint paint = new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#CC9966"));

        path.moveTo(75, 100);//1
        path.lineTo(75, 175);//2
        path.lineTo(250, 175);//3
        path.lineTo(250, 100);//4
        path.lineTo(75, 100);//5

        path.close();

        canvas.drawPath(path, paint);

        Paint paint2 = new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor("#FFFFCC"));

        path2.moveTo(100, 100);//1
        path2.lineTo(225, 100);//2
        path2.lineTo(225, 25);//3
        path2.lineTo(200, 25);//4
        path2.lineTo(200, 50);//5

        path2.lineTo(125, 50);//2
        path2.lineTo(125, 25);//3
        path2.lineTo(100, 25);//4
        path2.lineTo(100, 100);//5

        path2.close();

        canvas.drawPath(path2, paint2);

        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.BLACK);

        path3.moveTo(125, 100);//1
        path3.lineTo(150, 100);//2
        path3.lineTo(150, 75);//3
        path3.lineTo(125, 75);//4
        path3.lineTo(125, 100);//5

        path3.moveTo(175, 100);//1
        path3.lineTo(200, 100);//2
        path3.lineTo(200, 75);//3
        path3.lineTo(175, 75);//4
        path3.lineTo(175, 100);//5

        path3.close();

        canvas.drawPath(path3, paint3);

        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.parseColor("#FF0066"));

        path4.moveTo(100, 125);//1
        path4.lineTo(100, 150);//2
        path4.lineTo(125, 150);//3
        path4.lineTo(125, 125);//4
        path4.lineTo(100, 125);//5

        path4.moveTo(200, 125);//1
        path4.lineTo(200, 150);//2
        path4.lineTo(225, 150);//3
        path4.lineTo(225, 125);//4
        path4.lineTo(200, 125);//5


        path4.close();

        canvas.drawPath(path4, paint4);
    }
}
