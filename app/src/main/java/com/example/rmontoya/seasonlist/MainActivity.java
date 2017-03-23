package com.example.rmontoya.seasonlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rmontoya.seasonlist.adapters.SeasonsAdapter;
import com.example.rmontoya.seasonlist.model.Seasons;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Seasons seasons = new Seasons();

        RecyclerView seasonsList = (RecyclerView) findViewById(R.id.seasons_list);
        seasonsList.hasFixedSize();
        seasonsList.setLayoutManager(new LinearLayoutManager(this));
        SeasonsAdapter adapter = new SeasonsAdapter(Arrays.asList(seasons.getSeasonsArray()));
        seasonsList.setAdapter(adapter);
    }
}
