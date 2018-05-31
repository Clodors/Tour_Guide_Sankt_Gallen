package com.example.android.myapplication;


import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView museum = (TextView) findViewById(R.id.museums);
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumIntent);
            }
        });
        TextView nature = (TextView) findViewById(R.id.nature);
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);
                startActivity(natureIntent);
            }
        });
        TextView attractions = (TextView) findViewById(R.id.attractions);
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });
        TextView zoo = (TextView) findViewById(R.id.zoo);
        zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zooIntent = new Intent(MainActivity.this, ZooActivity.class);
                startActivity(zooIntent);
            }
        });
    }
}

