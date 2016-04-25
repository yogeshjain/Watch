package dmm8396.rit.edu.test;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Test extends Activity {

    private RelativeLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round_activity_test);
        main = (RelativeLayout) findViewById(R.id.test);
        BPV bpv = new BPV(this);
        RelativeLayout.LayoutParams params = new RelativeLayout
                .LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        main.addView(bpv,params);
        bpv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();

                Bitmap bitmap = loadBitmapFromView(v);
                int pixel = bitmap.getPixel((int)x,(int)y);
                int redValue = Color.red(pixel);
                int blueValue = Color.blue(pixel);
                int greenValue = Color.green(pixel);
                switch (pixel){
                    case Color.RED:
                        Log.e("Color is","RED");
                        break;
                    case Color.BLUE:
                        Log.e("Color is","BLUE");
                        break;
                    case Color.GREEN:
                        Log.e("Color is","GREEN");
                        break;
                    case Color.WHITE:
                        Log.e("Color is","WHITE");
                        break;
                    case Color.YELLOW:
                        Log.e("Color is","YELLOW");
                        break;
                    case Color.BLACK:
                        Log.e("Color is","BLACK");
                        break;
                    case Color.CYAN:
                        Log.e("Color is","CYAN");
                        break;
                    case Color.MAGENTA:
                        Log.e("Color is","MAGENTA");
                        break;
                }
                return true;
            }
        });
    }

    public Bitmap loadBitmapFromView(View v) {
        Bitmap b = Bitmap.createBitmap( v.getWidth(), v.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        v.layout(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
        v.draw(c);
        return b;
    }
}
