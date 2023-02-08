package com.geektech.hw_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.hw_3_3.databinding.ItemNameBinding;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private ArrayList<String> nameList;

    public NameAdapter(ArrayList<String> nameList) {
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(ItemNameBinding.inflate(LayoutInflater
                .from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.bind(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}

class NameViewHolder extends RecyclerView.ViewHolder{

    private ItemNameBinding binding;

    public NameViewHolder(ItemNameBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(String name){
        binding.tvName.setText(name);
    }
}
