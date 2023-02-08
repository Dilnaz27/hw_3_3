package com.geektech.hw_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.hw_3_3.databinding.FragmentAnimalBinding;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {

    private FragmentAnimalBinding binding;
    private ArrayList<String> animalList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnimalBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        AnimalAdapter adapter = new AnimalAdapter(animalList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        animalList = new ArrayList<>();
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Rat");
        animalList.add("Mouse");
        animalList.add("Cow");
        animalList.add("Horse");
        animalList.add("Lion");
        animalList.add("Tiger");
        animalList.add("Chicken");
        animalList.add("Panther");
        animalList.add("Panda");
        animalList.add("Zebra");
        animalList.add("Pig");
        animalList.add("Goat");
        animalList.add("Fox");
        animalList.add("Rabbit");
        animalList.add("Elephant");
        animalList.add("Kangaroo");
        animalList.add("Crocodile");
        animalList.add("Sheep");
    }
}