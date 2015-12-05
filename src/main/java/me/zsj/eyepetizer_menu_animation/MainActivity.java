package me.zsj.eyepetizer_menu_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;
    View mEyepetizerMenuView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");

        frameLayout = (FrameLayout) findViewById(R.id.view_layout);
        mImageView = (ImageView) findViewById(R.id.iv_action_menu);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mEyepetizerMenuView = LayoutInflater.from(this).inflate(R.layout.setting_view, null);
        frameLayout.addView(mEyepetizerMenuView);

        new EyepetizerMenuAnimation.EyepetizerMenuBuilder(
                this, mEyepetizerMenuView, mImageView)
                .build();
    }


}
