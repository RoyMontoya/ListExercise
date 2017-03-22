package com.example.rmontoya.seasonlist.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SeasonsAdapter extends ArrayAdapter<String> {

    private List<String> items;

    public SeasonsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        items = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, null);
        }
        TextView rowText = (TextView) convertView.findViewById(android.R.id.text1);
        rowText.setText(items.get(position));
        return convertView;
    }

    public List<String> getItems() {
        return items;
    }

}
