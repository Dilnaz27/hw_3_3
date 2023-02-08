package com.geektech.hw_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.hw_3_3.databinding.FragmentNameBinding;

import java.util.ArrayList;

public class NameFragment extends Fragment {

    private FragmentNameBinding binding;
    private ArrayList<String> nameList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNameBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        NameAdapter adapter = new NameAdapter(nameList);
        binding.recyclerView.setAdapter(adapter);
        goToNextFragment();
    }

    private void goToNextFragment() {
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new MonthFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void loadData() {
        nameList = new ArrayList<>();

        nameList.add("Usama");
        nameList.add("Abdulaziz");
        nameList.add("Zarlyk");
        nameList.add("Ibrahim");
        nameList.add("Nurzat");
        nameList.add("Askat");
        nameList.add("Nigora");
        nameList.add("Aijan");
        nameList.add("Dilnaz");
        nameList.add("Bekulan");
        nameList.add("Nikolai");
        nameList.add("Askar");
        nameList.add("Islam");
        nameList.add("Maxim");
        nameList.add("Azat");
        nameList.add("Ramis");
    }

}