package com.owl.drawablesample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by Alamusi on 2017/4/27.
 */

public class RotateActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        ImageView imageView = (ImageView) findViewById(R.id.id_rotate_iv_1);
        /*
          level取值范围为0~10000，应用到rotate，则与fromDegrees~toDegrees相对应
          level取值0时，则旋转为0度；level为10000时，则旋转180度；level为5000时，则旋转90度
         */
        imageView.getDrawable().setLevel(5000);
    }
}
