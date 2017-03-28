package com.example.rmontoya.seasonlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.rmontoya.seasonlist.adapters.SeasonsAdapter;
import com.example.rmontoya.seasonlist.model.Seasons;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView seasonsList = (ListView) findViewById(R.id.seasons_list);
        SeasonsAdapter adapter = new SeasonsAdapter(this, android.R.layout.simple_list_item_1,
                Arrays.asList(Seasons.values()));
        seasonsList.setAdapter(adapter);
    }

}