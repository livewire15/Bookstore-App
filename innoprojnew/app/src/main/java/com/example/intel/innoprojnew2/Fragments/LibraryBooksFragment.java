package com.example.intel.innoprojnew2.Fragments;

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

public class LibraryBooksFragment extends Fragment {

    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    String text[]={"English","Mathematics","Mechanics","Physics","Aptitude and Reasoning",
            "Competition","Computer Science & Technology","General Knowledge",
            "Chemistry","Electricals & Electronics","hey"};

    public LibraryBooksFragment() {
        // Required empty public constructor
    }

    public static LibraryBooksFragment newInstance(String param1, String param2) {
        LibraryBooksFragment fragment = new LibraryBooksFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_library_books,container,false);
        ((BottomNavigationnew) getActivity()).getSupportActionBar().setTitle("Category");//set title of fragment action bar

        recyclerView=(RecyclerView)rootView.findViewById(R.id.recyclerview);
        gridLayoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(getContext(),text);
        recyclerView.setAdapter(recyclerAdapter);
        return rootView;
    }
}
