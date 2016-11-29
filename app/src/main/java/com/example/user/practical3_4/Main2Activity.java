package com.example.user.practical3_4;

import android.app.Activity;
import android.support.v4.view.MotionEventCompat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.TextView;

public class Main2Activity extends Activity {

    TextView textViewMessage;
    float xy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);
        if (action == MotionEvent.ACTION_DOWN) { //Touching screen
            xy = event.getX();
            return true;
        }
        if (action == MotionEvent.ACTION_UP) { //Release touch
            float diff = xy - event.getX();
            if (diff > 100) {
                textViewMessage.setText("Move to the LEFT.");
            } else if (diff < -100) {
                textViewMessage.setText("Move to the RIGHT.");
            }
        }
        return super.onTouchEvent(event);
    }
}
