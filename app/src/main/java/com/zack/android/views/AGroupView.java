package com.zack.android.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by kang on 2016/10/1.
 */

public class AGroupView extends LinearLayout {
    public AGroupView(Context context) {
        super(context);
    }

    public AGroupView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AGroupView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean isInterceptTouch = false;
        String msg = "";
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                //isInterceptTouch = true;
                msg = "down";
                break;
            case MotionEvent.ACTION_UP:
                //isInterceptTouch = true;
                msg = "up";
                break;
            case MotionEvent.ACTION_MOVE:
                msg = "move";
                break;
            case MotionEvent.ACTION_CANCEL:
                msg = "cancel";
                break;
            case MotionEvent.ACTION_OUTSIDE:
                msg = "outside";
                break;
            default:
                msg = ""+ev.getAction();
        }
        Log.d("onInterceptTouchEvent","A:"+msg);
        return isInterceptTouch;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isInterceptTouch = false;
        String msg = "";
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                msg = "down";
               // isInterceptTouch=true;
                break;
            case MotionEvent.ACTION_UP:
                msg = "up";
                break;
            case MotionEvent.ACTION_MOVE:
                msg = "move";
                break;
            case MotionEvent.ACTION_CANCEL:
                msg = "cancel";
                break;
            case MotionEvent.ACTION_OUTSIDE:
                msg = "outside";
                break;
            default:
                msg = ""+event.getAction();
        }
        Log.d("onTouchEvent","A:"+msg);
        return isInterceptTouch;
    }
}
