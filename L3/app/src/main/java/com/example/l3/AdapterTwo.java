package com.example.l3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterTwo extends RecyclerView.Adapter<AdapterTwo.ViewHolder> {
    private final ActivityDet detailActivity;

    private String[] values;
    AdapterTwo(ActivityDet parent, String[] items) {
        detailActivity = parent;
        values = new String[items.length-1];
        for(int i=1; i<=values.length;i++)
            values[i-1] = items[i];
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_two, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.contentView.setText(values[position]);
    }
    @Override
    public int getItemCount() { return values.length;}

    class ViewHolder extends RecyclerView.ViewHolder {
        final TextView contentView;

        ViewHolder(View view) {
            super(view);
            contentView = view.findViewById(R.id.secondary_item);
        }
    }
}

