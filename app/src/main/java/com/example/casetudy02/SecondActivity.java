package com.example.casetudy02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String ht = getIntent().getExtras().getString("ht");
        String ns =  getIntent().getExtras().getString("ns");
        String hoten = "Họ tên là: "+ ht +"/n";
        String namSinh = "Năm sinh là: " + ns;
        String kq = hoten + namSinh;
        TextView textView_KQ = findViewById(R.id.tw_KQ);
        textView_KQ.setText(kq);


    }
}