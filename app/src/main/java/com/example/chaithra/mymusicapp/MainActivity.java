package com.example.chaithra.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button,searchbutton,songdetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.Mainactivty);
        searchbutton=(Button) findViewById(R.id.searchbutton);
        songdetails=(Button)findViewById(R.id.Songdetailbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NowPlaying.class);
                startActivity(intent);
            }
        });
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
        songdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Songdetail.class);
                startActivity(intent);
            }
        });
    }
}
