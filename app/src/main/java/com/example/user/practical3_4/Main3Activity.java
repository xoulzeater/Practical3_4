package com.example.user.practical3_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;



public class Main3Activity extends Activity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    GestureDetector mDetector;
    TextView textViewMessage;
    String s = "";
    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
// Instantiate the gesture detector with the
// application context and an implementation of
// GestureDetector.OnGestureListener
        mDetector = new GestureDetector(this, this);
// Set the gesture detector as the double tap
// listener.
        mDetector.setOnDoubleTapListener(this);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.mDetector.onTouchEvent(event);
// Be sure to call the superclass implementation
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onDown(MotionEvent event) {
        textViewMessage.setText("onDown" );
        return true;
    }
    @Override
    public void onLongPress(MotionEvent event) {
        textViewMessage.setText("onLongPress");
    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
                            float distanceY) {
        textViewMessage.setText("onScroll");
        return true;
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        textViewMessage.setText("onSingleTapUpConfirmed");
        return true;
    }
    @Override
    public boolean onDoubleTap(MotionEvent event) {
        textViewMessage.setText("onDoubleTap");
        return true;
    }
    @Override
    public boolean onDoubleTapEvent(MotionEvent arg0) {
// TODO Auto-generated method stub
        textViewMessage.setText("onDoubleTapEvent");
        return false;
    }
    @Override
    public boolean onFling(MotionEvent arg0, MotionEvent arg1, float arg2,
                           float arg3) {
// TODO Auto-generated method stub
        return false;
    }
    @Override
    public void onShowPress(MotionEvent arg0) {
// TODO Auto-generated method stub
    }
    @Override
    public boolean onSingleTapUp(MotionEvent arg0) {
// TODO Auto-generated method stub
        textViewMessage.setText("onSingleTapUp");
        return false;
    }
}