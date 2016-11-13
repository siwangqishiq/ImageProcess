package com.xinlan.imageprocess;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImage;

    private Bitmap bit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImage = (ImageView)findViewById(R.id.image);

        bit = BitmapFactory.decodeResource(this.getResources(),R.drawable.shu);
        bit = bit.copy(Bitmap.Config.ARGB_8888,false);

        mImage.setImageBitmap(bit);

        findViewById(R.id.btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        NativeLib.process(bit,bit.getWidth(),bit.getHeight());

        mImage.setImageBitmap(bit);
    }
}//end class
