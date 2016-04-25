package dmm8396.rit.edu.test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Crash.Overide.007 on 4/25/16.
 */
public class BPV extends ImageView {

    private RectF rectF;
    public BPV(Context context) {
        super(context);
        rectF = new RectF(0,0,320,320);
    }

    public BPV(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BPV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BPV(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);
        canvas.drawArc(rectF,270,72,true,p);
        p.setColor(Color.GREEN);
        canvas.drawArc(rectF,342,72,true,p);
        p.setColor(Color.YELLOW);
        canvas.drawArc(rectF,54,72,true,p);
        p.setColor(Color.CYAN);
        canvas.drawArc(rectF,126,72,true,p);
        p.setColor(Color.BLUE);
        canvas.drawArc(rectF,198,72,true,p);
    }

    /*@Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event) {
            case MotionEvent.ACTION_DOWN:

        }
        return super.onTouchEvent(event);
    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {

        @Override
        public boolean onTouch(MotionEvent event){
        }
        }
        int x=0;
        int y=0;
        Bitmap bitmap = ((BitmapDrawable)this.getDrawable()).getBitmap();
        int pixel = bitmap.getPixel(x,y);
        int redValue = Color.red(pixel);
        Log.i("PIXEL",String.valueOf(pixel));
        int blueValue = Color.blue(pixel);
        int greenValue = Color.green(pixel);
        switch (pixel) {
            case Color.RED:
                Log.i("Color is", "RED");
                break;
            case Color.BLUE:
                Log.i("Color is", "BLUE");
                break;
            case Color.GREEN:
                Log.i("Color is", "GREEN");
                break;
            case Color.WHITE:
                Log.i("Color is", "WHITE");
                break;
            case Color.YELLOW:
                Log.i("Color is", "YELLOW");
                break;
            case Color.BLACK:
                Log.i("Color is", "BLACK");
                break;
            case Color.CYAN:
                Log.i("Color is", "CYAN");
                break;
            case Color.MAGENTA:
                Log.i("Color is", "MAGENTA");
                break;
        }
        super.setOnTouchListener(l);
    }*/
}
