package com.geektech.hw_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.hw_3_3.databinding.ItemMonthBinding;

import java.util.ArrayList;

public class MonthAdapter extends RecyclerView.Adapter<MonthViewHolder> {

    private ArrayList<String> monthList;

    public MonthAdapter(ArrayList<String> monthList) {
        this.monthList = monthList;
    }

    @NonNull
    @Override
    public MonthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MonthViewHolder(ItemMonthBinding.inflate(LayoutInflater
                .from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MonthViewHolder holder, int position) {
        holder.bind(monthList.get(position));
    }

    @Override
    public int getItemCount() {
        return monthList.size();
    }
}

class MonthViewHolder extends RecyclerView.ViewHolder{

    private ItemMonthBinding binding;

    public MonthViewHolder(ItemMonthBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(String month){
        binding.tvMonth.setText(month);
    }
}
