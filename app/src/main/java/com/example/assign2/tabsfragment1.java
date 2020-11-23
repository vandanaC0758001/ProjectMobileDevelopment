package com.example.assign2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tabsfragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tabsfragment1 extends Fragment {



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public tabsfragment1() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabsfragment1, container, false);
    }
}