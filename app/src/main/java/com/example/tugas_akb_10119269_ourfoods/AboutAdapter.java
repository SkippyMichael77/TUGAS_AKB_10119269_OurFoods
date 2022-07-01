package com.example.tugas_akb_10119269_ourfoods;

//10119269 Zuhair Rasyid Wafi IF7

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AboutAdapter extends RecyclerView.Adapter<AboutAdapter.ViewHolder> {

    ArrayList<ObjectAbout> justObject;

    public AboutAdapter(ArrayList<ObjectAbout> justObject){
        this.justObject = justObject;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpager_items,
                parent,
                false);
        return new ViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ObjectAbout justObjects = justObject.get(position);
        holder.ivObject.setImageResource(justObjects.ivObject);
        holder.tvName.setText(justObjects.txTips);
    }

    @Override
    public int getItemCount() {
        return justObject.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivObject;
        TextView tvName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivObject = itemView.findViewById(R.id.ivAboutList);
            tvName = itemView.findViewById(R.id.txTipsList);
        }
    }
}

