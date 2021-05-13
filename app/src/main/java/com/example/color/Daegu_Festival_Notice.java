package com.example.color;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Daegu_Festival_Notice extends AppCompatActivity {


    Opera opera;
    Showroom showroom;
    Concert concert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daegu_festival_notice);

        opera = new Opera();
        showroom = new Showroom();
        concert = new Concert();

        Button btn_opera = findViewById(R.id.btn_opera);
        Button btn_showroom = findViewById(R.id.btn_showroom);
        Button btn_concert = findViewById(R.id.btn_concert);

        btn_opera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction().replace(R.id.container, opera).commit();
            }
        });

        btn_showroom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction().replace(R.id.container, showroom).commit();
            }
        });

        btn_concert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getSupportFragmentManager().beginTransaction().replace(R.id.container, concert).commit();
            }
        });
    }

    public void onFragmentChange(int index){
        if(index == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, opera).commit();
        }else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, showroom).commit();
        }else if(index == 2){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, concert).commit();
        }
    }
}