package dmm8396.rit.edu.test;

import android.app.Activity;
import android.graphics.Bitmap;
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
                float x = v.getX();
                float y = v.getY();
                Bitmap bitmap = Bitmap.createBitmap(v.getWidth(), v.getHeight(), Bitmap.Config.RGB_565);
                int pixel = bitmap.getPixel((int)x,(int)y);
                int redValue = Color.red(pixel);
                int blueValue = Color.blue(pixel);
                int greenValue = Color.green(pixel);
                switch (pixel){
                    case Color.RED:
                        Log.i("Color is","RED");
                        break;
                    case Color.BLUE:
                        Log.i("Color is","BLUE");
                        break;
                    case Color.GREEN:
                        Log.i("Color is","GREEN");
                        break;
                    case Color.WHITE:
                        Log.i("Color is","WHITE");
                        break;
                    case Color.YELLOW:
                        Log.i("Color is","YELLOW");
                        break;
                    case Color.BLACK:
                        Log.i("Color is","BLACK");
                        break;
                    case Color.CYAN:
                        Log.i("Color is","CYAN");
                        break;
                    case Color.MAGENTA:
                        Log.i("Color is","MAGENTA");
                        break;
                }
                return true;
            }
        });
    }
}
