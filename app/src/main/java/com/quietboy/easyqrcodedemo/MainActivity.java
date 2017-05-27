package com.quietboy.easyqrcodedemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.quietboy.easyqrcode.BGAQRCodeUtil;
import com.quietboy.easyqrcode.QRCodeEncoder;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.imageview);

    }

    public void scanClick(View view) {
        startActivity(new Intent(this, ScanActivity.class));
    }

    public void goClick(View view) {
        Bitmap mBitmap = QRCodeEncoder.syncEncodeQRCode("YNTNSW", BGAQRCodeUtil.dp2px(this, 150), android.R.color.darker_gray);
        mImageView.setImageBitmap(mBitmap);
    }

}
