package com.example.l3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_Regular extends RecyclerView.Adapter<Adapter_Regular.ViewHolder> {
    private final MainActivity mainActivity;
    private final List<ContentFiller.DummyItem> values;

    Adapter_Regular(MainActivity parent, List<ContentFiller.DummyItem> items) {
        mainActivity = parent;
        values = items;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_regular, parent, false);
        return new ViewHolder(view);
    }
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.idView.setText(values.get(position).id);
        holder.contentView.setText(values.get(position).content);
        holder.itemView.setTag(values.get(position));
    }
    @Override
    public int getItemCount() { return values.size(); }

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView idView;
        final TextView contentView;

        ViewHolder(View view) {
            super(view);
            idView = view.findViewById(R.id.id_text);
            contentView = view.findViewById(R.id.content);
        }
    }


}

