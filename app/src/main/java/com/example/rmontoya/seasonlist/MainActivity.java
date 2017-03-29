package com.example.rmontoya.seasonlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.rmontoya.seasonlist.adapters.SeasonsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView seasonsList = (ListView) findViewById(R.id.seasons_list);
        SeasonsAdapter adapter = new SeasonsAdapter(this, android.R.layout.simple_list_item_1,
                makeElementsForList());
        seasonsList.setAdapter(adapter);
    }

    private List<String> makeElementsForList() {
        List<String> elements = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            elements.add("element " + i);
        }
        return elements;
    }

}