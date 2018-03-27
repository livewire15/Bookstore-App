package com.example.intel.innoprojnew2.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intel.innoprojnew2.R;

public class BorrowZone extends Fragment {

    public BorrowZone() {
        // Required empty public constructor
    }

    public static BorrowZone newInstance(String param1, String param2) {
        BorrowZone fragment = new BorrowZone();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_borrow_zone, container, false);
    }

}
