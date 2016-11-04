package com.whx.drawabletest;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageScale, imageClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        textView = (TextView) findViewById(R.id.text);
        imageScale = (ImageView) findViewById(R.id.test_scale);
        imageClip = (ImageView) findViewById(R.id.test_clip);

        TransitionDrawable transitionDrawable = (TransitionDrawable) textView.getBackground();
        transitionDrawable.startTransition(1000);

        ScaleDrawable scaleDrawable = (ScaleDrawable) imageScale.getDrawable();
        scaleDrawable.setLevel(1);

        ClipDrawable clipDrawable = (ClipDrawable) imageClip.getDrawable();
        clipDrawable.setLevel(5000);
    }
}
