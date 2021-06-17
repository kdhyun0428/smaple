package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_OK){
            if(resultCode == Activity.RESULT_OK){
                System.out.println();
            }

            }
        }
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TextView textView = (TextView) findViewById(R.id.textview);
//        textView.setTextColor(0xffff0000);
//    }
//    public void click1(View view){
//        Intent  intent = new Intent(getApplicationContext());
//        startActivity(R.layout.activity,getIntent());//단순이동
//        startActivityForResult();//갔다가 다시 돌아오는 함수
//    }
//}