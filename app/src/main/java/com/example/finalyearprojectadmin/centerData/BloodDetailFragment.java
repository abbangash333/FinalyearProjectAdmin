package com.example.finalyearprojectadmin.centerData;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalyearprojectadmin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BloodDetailFragment extends Fragment {


    public BloodDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blood_detail, container, false);
    }

}
