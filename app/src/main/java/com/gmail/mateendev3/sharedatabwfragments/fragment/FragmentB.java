package com.gmail.mateendev3.sharedatabwfragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gmail.mateendev3.sharedatabwfragments.R;
import com.gmail.mateendev3.sharedatabwfragments.model.Student;

public class FragmentB extends Fragment {
    TextView tvResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        tvResult = view.findViewById(R.id.tv_result_f2);
        return view;
    }

    public void getData(Student student) {
        tvResult.setText("" + student);
    }
}