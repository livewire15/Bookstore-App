package com.example.intel.innoprojnew2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class libbooks extends AppCompatActivity {

    GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libbooks);
        gv=(GridView)findViewById(R.id.gridview);
    }
}
