package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ZooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Word> zooDesc = new ArrayList<Word>();
        zooDesc.add(new Word(R.string.knies_kinderzoo_header, R.string.knies_kinderzoo_information, R.drawable.knies_kinderzoo));
        zooDesc.add(new Word(R.string.peter_and_paul_header, R.string.peter_and_paul_information, R.drawable.peterandpaul));
        zooDesc.add(new Word(R.string.walter_zoo_header, R.string.walter_zoo_information, R.drawable.walter_zoo));
        zooDesc.add(new Word(R.string.greifvogelpark_header, R.string.greifvogelpark_information,R.drawable.greifvogelpark));

        WordAdapter adapter = new WordAdapter(this, zooDesc);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}