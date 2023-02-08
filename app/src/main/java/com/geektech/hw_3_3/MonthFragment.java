package com.geektech.hw_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.hw_3_3.databinding.FragmentMonthBinding;

import java.util.ArrayList;


public class MonthFragment extends Fragment {

    private FragmentMonthBinding binding;
    private ArrayList<String> monthList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMonthBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        MonthAdapter adapter = new MonthAdapter(monthList);
        binding.recyclerView.setAdapter(adapter);
        goToNextFragment();
    }

    private void goToNextFragment() {
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new AnimalFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void loadData() {
        monthList = new ArrayList<>();

        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");
    }
}