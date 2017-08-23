package rippleeffect.c4console.com.buttonclickeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.andexert.library.RippleView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //    If you want Ripple Effect on button Then Uncomment code and follow them
        final RippleView rippleView = (RippleView) findViewById(R.id.rect);
        final TextView textView = (TextView) findViewById(R.id.rect_child);

        rippleView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Log.e("Sample", "Click Rect !");
            }
        });
        rippleView.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");
            }
        });
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.e("Sample", "Click rect child !");
            }
        });

    }
}
