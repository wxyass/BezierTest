package com.wxyass.beziertest.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by yangwenmin on 2018/1/1.
 */

public class SecondBezierView extends View {

    // 起始点坐标
    private float mStartPointX;
    private float mStartPointY;

    // 终点坐标
    private float mEndPointX;
    private float mEndPointY;

    //
    private float mFlagPointX;
    private float mFlagPointY;

    //
    private Path mPath;

    //
    private Paint mPaintBezuer;
    private Paint mPaintFlag;
    private Paint mPaintFlagText;


    public SecondBezierView(Context context) {
        super(context);
    }

    public SecondBezierView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaintBezuer = new Paint(Paint.ANTI_ALIAS_FLAG);//kangjuchi
        mPaintBezuer.setStrokeWidth(8);
        mPaintBezuer.setStyle(Paint.Style.STROKE);
    }

    public SecondBezierView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        // 固定起点,
        mStartPointX = w / 4;//
        mStartPointY = h / 2 - 200;

        // 固定终点坐标
        mEndPointX = w * 3 / 4;
        mEndPointY = h / 2 - 200;

        mFlagPointX = w / 2;
        mFlagPointY = h / 2 - 300;

        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPath.reset();;//
        mPath.moveTo(mStartPointX,mStartPointY);

        mPath.quadTo(mFlagPointX,mFlagPointY,mEndPointX,mEndPointY);
        canvas.drawPoint(mStartPointX,mStartPointY,mPaintFlag);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
