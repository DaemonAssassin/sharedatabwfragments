package com.gmail.mateendev3.sharedatabwfragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.gmail.mateendev3.sharedatabwfragments.R;
import com.gmail.mateendev3.sharedatabwfragments.fragment.FragmentA;
import com.gmail.mateendev3.sharedatabwfragments.fragment.FragmentB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fragmentA = (FragmentA) getSupportFragmentManager()
                .findFragmentById(R.id.fcv_fragment_container_view);

        fragmentA.setOnFragmentDataGetListener(student -> {
            if (student != null) {
                FragmentB fragmentB = (FragmentB) getSupportFragmentManager()
                        .findFragmentById(R.id.fcv_fragment_container_view_2);
                fragmentB.getData(student);
            }
        });
    }
}