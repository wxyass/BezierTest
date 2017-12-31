package com.wxyass.beziertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*二阶Bezier曲线*/
    public void secondBezierTest(View view) {
        startActivity(new Intent(this, SecondBezierActivity.class));
    }

    /*三阶Bezier曲线*/
    public void thirdBezierTest(View view) {
        startActivity(new Intent(this, ThirdBezierActivity.class));
    }

    /*两点连线的圆滑处理*/
    public void drawPadBezierTest(View view) {
        startActivity(new Intent(this, DrawPadActivity.class));
    }

    /*路径变换动画*/
    public void pathMorthingBezierTest(View view) {
        startActivity(new Intent(this, PathMorthingActivity.class));
    }

    /*波浪效果*/
    public void waveBezierTest(View view) {
        startActivity(new Intent(this, WaveActivity.class));
    }

    /*轨迹动画*/
    public void pathBezierTest(View view) {
        startActivity(new Intent(this, PathBezierActivity.class));
    }
}
