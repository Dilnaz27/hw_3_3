package com.geektech.hw_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.hw_3_3.databinding.ItemAnimalBinding;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private ArrayList<String> animalList;

    public AnimalAdapter(ArrayList<String> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(ItemAnimalBinding.inflate(LayoutInflater
                .from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        holder.bind(animalList.get(position));
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}

class AnimalViewHolder extends RecyclerView.ViewHolder{

    private ItemAnimalBinding binding;

    public AnimalViewHolder(ItemAnimalBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(String animal){
        binding.tvAnimal.setText(animal);
    }
}
