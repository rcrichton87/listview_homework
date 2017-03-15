package com.codeclan.pilotrankings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopPilotsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pilot_list);
        TopPilots topPilots = new TopPilots();
        ArrayList<Pilot> list = topPilots.getList();

        TopPilotsAdapter pilotAdapter = new TopPilotsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(pilotAdapter);
    }

}
