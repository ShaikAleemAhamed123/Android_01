package com.aleemahamedsportfolio.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,getString(R.string.receive_message), Toast.LENGTH_SHORT).show();
                Log.v("CLICKED","Button1 Clicked !");
            }
        });
        Button b2= findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,getString(R.string.receive_message), Toast.LENGTH_SHORT).show();
                Log.v("CLICKED","Button2 Clicked !");
            }
        });
        Button home= findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,getString(R.string.receive_message), Toast.LENGTH_SHORT).show();
                Log.v("CLICKED","Home Button Clicked !");
            }
        });

    }

}