package com.reacompany.reaproyecto;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by qas on 6/09/16.
 */
public class ApagadoLeon extends ControlComida {
    @Override
    public void presionarSwitch(LeonState leonState, Canvas canvas) {
        leonState.setEstado(new EncendidoLeon());

        ///escalas de grises

        Paint paint5=new Paint();
        Path path5 = new Path();
        paint5.setStyle(Paint.Style.FILL);
        paint5.setColor(Color.BLACK);

        path5.moveTo(75, 150);
        path5.lineTo(75, 300);
        path5.lineTo(100,300);
        path5.lineTo(100, 375);
        path5.lineTo(125, 375);
        path5.lineTo(125, 400);
        path5.lineTo(175,400);
        path5.lineTo(175,425);
        path5.lineTo(225,425);
        path5.lineTo(225,450);
        path5.lineTo(250,450);
        path5.lineTo(250,475);
        path5.lineTo(275,475);
        path5.lineTo(275,450);
        path5.lineTo(300,450);
        path5.lineTo(300,425);
        path5.lineTo(350,425);
        path5.lineTo(350,400);
        path5.lineTo(400,400);
        path5.lineTo(400,375);
        path5.lineTo(425,375);

        path5.lineTo(425,300);
        path5.lineTo(450,300);
        path5.lineTo(450,150);
        path5.lineTo(425,150);
        path5.lineTo(425,125);
        path5.lineTo(375,125);
        path5.lineTo(375,100);
        path5.lineTo(325,100);
        path5.lineTo(325,75);
        path5.lineTo(200,75);
        path5.lineTo(200,100);
        path5.lineTo(150,100);
        path5.lineTo(150,125);
        path5.lineTo(100,125);
        path5.lineTo(100,150);
        path5.lineTo(75,150);


        path5.close();

        canvas.drawPath(path5,paint5);

        Paint paint6 = new Paint();
        Path path6 = new Path();
        paint6.setStyle(Paint.Style.FILL);
        paint6.setColor(Color.parseColor("#666666"));

        path6.moveTo(150, 225);//1
        path6.lineTo(150, 325);//2
        path6.lineTo(175, 325);//3
        path6.lineTo(175, 350);//4
        path6.lineTo(200, 350);//5
        path6.lineTo(200, 375);//2
        path6.lineTo(325, 375);//3
        path6.lineTo(325, 350);//4
        path6.lineTo(350, 350);//5
        path6.lineTo(350, 325);//2
        path6.lineTo(375, 325);//3
        path6.lineTo(375, 225);//4
        path6.lineTo(350, 225);//5
        path6.lineTo(350, 200);//2
        path6.lineTo(325, 200);//3
        path6.lineTo(325, 175);//4
        path6.lineTo(200, 175);//5
        path6.lineTo(200, 200);//2
        path6.lineTo(175, 200);//3
        path6.lineTo(175, 225);//4
        path6.lineTo(150, 225);//5

        path6.moveTo(100, 150);//1
        path6.lineTo(100, 200);//2
        path6.lineTo(125, 200);//3
        path6.lineTo(125, 175);//4
        path6.lineTo(150, 175);//5
        path6.lineTo(150, 150);//2
        path6.lineTo(100, 150);//3

        path6.moveTo(425, 150);//1
        path6.lineTo(425, 200);//2
        path6.lineTo(400, 200);//3
        path6.lineTo(400, 175);//4
        path6.lineTo(375, 175);//5
        path6.lineTo(375, 150);//2
        path6.lineTo(425, 150);//3

        path6.close();

        canvas.drawPath(path6, paint6);

        Paint paint7 = new Paint();
        Path path7 = new Path();
        paint7.setStyle(Paint.Style.FILL);
        paint7.setColor(Color.parseColor("#FFFFFF"));

        path7.moveTo(225, 275);//1
        path7.lineTo(225, 325);//2
        path7.lineTo(300, 325);//3
        path7.lineTo(300, 275);//4
        path7.lineTo(225, 275);//5

        path7.close();

        canvas.drawPath(path7, paint7);


        Paint paint8 = new Paint();
        Path path8 = new Path();
        paint8.setStyle(Paint.Style.FILL);
        paint8.setColor(Color.BLACK);

        path8.moveTo(175, 250);//1
        path8.lineTo(175, 275);//2
        path8.lineTo(200, 275);//3
        path8.lineTo(200, 250);//4
        path8.lineTo(175, 250);//5

        path8.moveTo(325, 250);//1
        path8.lineTo(325, 275);//2
        path8.lineTo(350, 275);//3
        path8.lineTo(350, 250);//4
        path8.lineTo(325, 250);//5

        path8.moveTo(250, 275);//1
        path8.lineTo(250, 300);//2
        path8.lineTo(275, 300);//3
        path8.lineTo(275, 275);//4
        path8.lineTo(250, 275);//5

        path8.close();

        canvas.drawPath(path8, paint8);

    }
}
