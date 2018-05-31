package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Word> attractionsDesc = new ArrayList<Word>();
        attractionsDesc.add(new Word(R.string.abbey_library_header, R.string.abbey_library_information, R.drawable.abbey_library));
        attractionsDesc.add(new Word(R.string.fuerstabtei_header, R.string.fuerstabtei_information, R.drawable.fuerstabtei));
        attractionsDesc.add(new Word(R.string.kathedrale_header, R.string.kathedrale_information, R.drawable.kathedrale));
        attractionsDesc.add(new Word(R.string.wooden_bridge_from_rapperswil_to_hurden_header, R.string.wooden_bridge_from_rapperswil_to_hurden_information,R.drawable.wooden_bridge_from_rapperswil_to_hurden));
        attractionsDesc.add(new Word(R.string.forum_wuerth_rorschach_header, R.string.forum_wuerth_rorschach_information,R.drawable.forum_wuerth_rorschach));

        WordAdapter adapter = new WordAdapter(this, attractionsDesc);
        ListView listView = (ListView) findViewById(R.id.list);




        
        listView.setAdapter(adapter);
    }
}