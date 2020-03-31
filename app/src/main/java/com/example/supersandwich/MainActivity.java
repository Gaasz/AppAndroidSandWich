package com.example.supersandwich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pantalla(View v){
        Intent intent = new Intent(this,info.class);
        startActivity(intent);
    }
    public void pantalla2(View v){
        Intent intent =new Intent(this,Sandwich.class);
        startActivity(intent);
    }
}
