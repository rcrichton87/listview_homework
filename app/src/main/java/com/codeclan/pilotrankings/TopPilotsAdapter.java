package com.codeclan.pilotrankings;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopPilotsAdapter extends ArrayAdapter<Pilot> {

    public TopPilotsAdapter(Context context, ArrayList<Pilot> pilots){
        super(context, 0, pilots);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.pilot_item, parent, false);
        }
        Pilot currentPilot = getItem(position);

        TextView rank = (TextView) listItemView.findViewById(R.id.rank);
        rank.setText(currentPilot.getRank().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.pilot);
        name.setText(currentPilot.getName().toString());

        TextView ship = (TextView) listItemView.findViewById(R.id.ship);
        ship.setText(currentPilot.getShip().toString());

        return listItemView;


    }
}
