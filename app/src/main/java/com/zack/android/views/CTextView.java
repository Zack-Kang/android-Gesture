package com.zack.android.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kang on 2016/10/1.
 */

public class CTextView extends TextView {
    public CTextView(Context context) {
        super(context);
    }

    public CTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isInterceptTouch = false;
        String msg = "";
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                //isInterceptTouch = true;
                msg = "down";
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


        Log.d("onTouchEvent","C:"+msg);
        return isInterceptTouch;
    }
}
