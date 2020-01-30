package edu.fje.dam2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * Classe que demostra el funcionament de Canvas.
 * Dibuixa directament sobre una View
 * @author sergi.grau@fje.edu
 * @version 5.0 27.01.2020
 */
public class M05_CanvasBasic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m05_canvas_basic_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView imageView=findViewById(R.id.imatge);
        Bitmap bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        canvas.drawRect((float) (Math.random()*100),(float) (Math.random()*100),(float) (Math.random()*100),(float) (Math.random()*100), paint);
        canvas.drawCircle(50, 50, 10, paint);
           for(int i=0;i<100;i++){
            paint.setColor(Color.argb((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255)));
            canvas.drawRect((float) (Math.random()*100),(float) (Math.random()*100),(float) (Math.random()*100),(float) (Math.random()*100), paint);
        }
        imageView.setImageBitmap(bitmap);

    }
}
