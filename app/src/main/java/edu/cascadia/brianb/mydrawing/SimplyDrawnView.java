package edu.cascadia.brianb.mydrawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Edited by Brian Bansenauer on 10/18/15.
 */
public class SimplyDrawnView extends View {

    private Paint mPaint;
    private Path mPath;
    private float mWidth, mHeight;

    public SimplyDrawnView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        mPaint = new Paint();
        mPath = new Path();
     }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE); //draw background

        //Draw line
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(16.0f);
        canvas.drawLine(mWidth, 0, 200, mHeight, mPaint);

        //TODO: Finish drawing red line
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(10);
        canvas.drawLine(50,100,800,1000, mPaint);

        //TODO: Draw green lines
        mPaint.setColor(Color.GREEN);
        mPaint.setStrokeWidth(30);
        float[] myFloat = {0,0, mWidth, 0,
                0, 50, mWidth, 50,
                0, 100, mWidth, 100,
                0, 150, mWidth, 150};

        canvas.drawLines(myFloat, mPaint);

        //TODO: Draw Text
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(80);
        canvas.drawText("x Marks the Spot", 500, 500, mPaint);

        //TODO: Draw Text on a Path
        mPaint.setColor(Color.BLUE);
        mPaint.setTextSize(80);
        mPath.addArc(50, 100, 400, 600, 10, 180);
        canvas.drawTextOnPath("Around the World!", mPath, 0, 0, mPaint);

        //TODO: Draw filled, opaque, and open ovals

        //TODO: Draw bee bitmap
        //     HINT: since b is a Drawable, you can use its .draw method, but .setBounds on it first
        Drawable b = getResources().getDrawable(R.drawable.bee,null);


        //TODO: Add another image to the project (copy and paste to Android Studio res/drawable folder)
        //     and draw it on the screen

    }
}
