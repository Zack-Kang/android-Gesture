package com.zack.android.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by kang on 2016/10/1.
 */

public class BGroupView extends LinearLayout {
    public BGroupView(Context context) {
        super(context);
    }

    public BGroupView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BGroupView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean isInterceptTouch = false;
        String msg = "";
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                msg = "down";
                //
                break;
            case MotionEvent.ACTION_UP:
                msg = "up";
                break;
            case MotionEvent.ACTION_MOVE:
                isInterceptTouch = true;
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
        Log.d("onInterceptTouchEvent","B:"+msg);
        return isInterceptTouch;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isInterceptTouch = false;
        String msg = "";
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                msg = "down";
                break;
            case MotionEvent.ACTION_UP:
                isInterceptTouch = true;
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
        Log.d("onTouchEvent","B:"+msg);
        return isInterceptTouch;
    }
}
