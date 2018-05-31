package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Word> museumsDesc = new ArrayList<Word>();
        museumsDesc.add(new Word(R.string.naturmuseum_header, R.string.naturmuseum_information, R.drawable.naturmuseum));
        museumsDesc.add(new Word(R.string.festungsmuseum_heldsberg_header, R.string.festungsmuseum_heldsberg_information, R.drawable.festungsmuseum_heldsberg));
        museumsDesc.add(new Word(R.string.museum_appenzell_header, R.string.museum_appenzell_information, R.drawable.museum_appenzell));
        museumsDesc.add(new Word(R.string.saurer_museum_header, R.string.saurer_museum_information,R.drawable.saurer_museum));
        museumsDesc.add(new Word(R.string.kunstmuseum_header, R.string.kunstmuseum_information,R.drawable.kunstmuseum));

        WordAdapter adapter = new WordAdapter(this, museumsDesc);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
