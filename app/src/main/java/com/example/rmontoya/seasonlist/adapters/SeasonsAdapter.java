package com.example.rmontoya.seasonlist.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rmontoya.seasonlist.model.Seasons;

import java.util.List;

public class SeasonsAdapter extends RecyclerView.Adapter<SeasonsAdapter.SeasonViewHolder> {

    private List<Seasons> seasons;

    public SeasonsAdapter(List<Seasons> seasonsList) {
        this.seasons = seasonsList;
    }

    @Override
    public SeasonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new SeasonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SeasonViewHolder holder, int position) {
        holder.rowText.setText(seasons.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return seasons.size();
    }

    class SeasonViewHolder extends RecyclerView.ViewHolder {
        TextView rowText;

        SeasonViewHolder(View itemView) {
            super(itemView);
            rowText = (TextView) itemView.findViewById(android.R.id.text1);

        }
    }

}
