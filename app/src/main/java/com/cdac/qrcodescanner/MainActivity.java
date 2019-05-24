package com.cdac.qrcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents(){
        findViewById(R.id.buttonTakePicture).setOnClickListener(this);
        findViewById(R.id.buttonScanBarcode).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonScanBarcode:
                startActivity(new Intent(this,ScannerBarcodeActivity.class));
                break;
            case R.id.buttonTakePicture:
                startActivity(new Intent(this,PictureBarcodeActivity.class));
                break;
        }
    }
}