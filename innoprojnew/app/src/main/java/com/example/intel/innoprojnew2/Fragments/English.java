package com.example.intel.innoprojnew2.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intel.innoprojnew2.Adapter.RecyclerAdapter;
import com.example.intel.innoprojnew2.BottomNavigationnew;
import com.example.intel.innoprojnew2.R;

public class English extends Fragment {

    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;

    public English() {
        // Required empty public constructor
    }

    public static English newInstance(String param1, String param2) {
        English fragment = new English();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_english,container,false);
        ((BottomNavigationnew) getActivity()).getSupportActionBar().setTitle("English");//set title of fragment action bar

        recyclerView=(RecyclerView)rootView.findViewById(R.id.recyclerview);
        gridLayoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(getContext(),text);
        recyclerView.setAdapter(recyclerAdapter);
        return rootView;
    }

}
