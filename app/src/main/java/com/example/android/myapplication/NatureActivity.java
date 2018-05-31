package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Word> natureDesc = new ArrayList<Word>();
        natureDesc.add(new Word(R.string.saentis_mountain_header, R.string.saentis_mountain_information, R.drawable.saentis_mountain));
        natureDesc.add(new Word(R.string.kurpark_bad_ragaz_header, R.string.kurpark_bad_ragaz_information, R.drawable.kurpark_bad_ragatz));
        natureDesc.add(new Word(R.string.botanical_garden_header, R.string.botanical_garden_information, R.drawable.botanical_garden));
        natureDesc.add(new Word(R.string.heididorf_header, R.string.heididorf_information,R.drawable.heididorf));

        WordAdapter adapter = new WordAdapter(this, natureDesc);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}