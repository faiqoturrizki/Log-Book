package com.example.logbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {
    FloatingActionButton bttambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bttambah = findViewById(R.id.btadd);
        bttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main2Activity.this,AddActivity.class);
                startActivity(intent);
                finish();
            }
        });
        }
    }

