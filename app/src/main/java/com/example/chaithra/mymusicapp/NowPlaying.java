package com.example.chaithra.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {
Button nowplaying;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);
        nowplaying=(Button)findViewById(R.id.nowplaying);
        nowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NowPlaying.this,Songdetail.class);
                startActivity(intent);
            }
        });
    }

}
