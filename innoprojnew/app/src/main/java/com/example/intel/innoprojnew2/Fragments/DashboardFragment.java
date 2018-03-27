package com.example.intel.innoprojnew2.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.intel.innoprojnew2.R;
import com.example.intel.innoprojnew2.qrimagelib;

public class DashboardFragment extends Fragment {

    Button qrcode,logout;
    TextView tv1,tv2,tv3;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView=inflater.inflate(R.layout.fragment_dashboard, container, false);
        tv1=(TextView)rootView.findViewById(R.id.tv1);
        tv2=(TextView)rootView.findViewById(R.id.tv2);
        tv3=(TextView)rootView.findViewById(R.id.tv3);
        tv1.setText(getActivity().getIntent().getStringExtra("name"));
        tv2.setText(getActivity().getIntent().getStringExtra("email"));
        tv3.setText(getActivity().getIntent().getStringExtra("libid"));
        qrcode=(Button)rootView.findViewById(R.id.qrcode);
        qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans=tv3.getText().toString();
                Toast.makeText(getContext(),"hey",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getContext(),qrimagelib.class);
                intent.putExtra("libid",ans);
                startActivity(intent);
            }
        });

       /* logout=(Button)rootView.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),MainActivity.class);
                i.putExtra("username","");
                startActivity(i);
                Toast.makeText(getContext(),"Logged out Successfully!",Toast.LENGTH_SHORT).show();
            }
        });*/

        return rootView;
    }

}

