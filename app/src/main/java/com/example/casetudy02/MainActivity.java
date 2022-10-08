package com.example.casetudy02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_HoTen = findViewById(R.id.et_HoTen);
        EditText editText_NgaySinh = findViewById(R.id.et_NgaySinh);
        Button btn_Submit = findViewById(R.id.btn_Gui);
        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("ht", editText_HoTen.getText().toString());
                intent.putExtra("ns", editText_NgaySinh.getText().toString());
                startActivity(intent);
            }
        });




    }
}