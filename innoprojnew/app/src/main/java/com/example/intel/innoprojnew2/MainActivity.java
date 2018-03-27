package com.example.intel.innoprojnew2;

import android.app.ActionBar;
import android.content.Intent;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.util.SortedList;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.dd.CircularProgressButton;
import com.squareup.okhttp.OkHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import android.os.Handler;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.OkClient;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {


    EditText e1, e2;
    Button go_to;
   CircularProgressButton cpb;
    String strurl = "http://192.168.43.55";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        go_to = (Button)findViewById(R.id.go_to);
       cpb = (CircularProgressButton) findViewById(R.id.button);
        e1.setText(this.getIntent().getStringExtra("username"));
        e2.setText(this.getIntent().getStringExtra("password"));
       cpb.setIndeterminateProgressMode(true);

        go_to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,BottomNavigationnew.class));
            }
        });
    }

    private void insertuser() {
        OkHttpClient client=new OkHttpClient();
        client.setConnectTimeout(30, TimeUnit.SECONDS);
        client.setReadTimeout(30, TimeUnit.SECONDS);
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(strurl).setLogLevel(RestAdapter.LogLevel.FULL).setClient(new OkClient(client)).build();
        client api = adapter.create(client.class);

        //object of client interface is created(api)
        api.insertuser(
                e1.getText().toString(),
                e2.getText().toString(),
                //now e1,e2 and callback method all are passed as parameters to insertuser function

        new Callback<pojo>() {
                    @Override
                    public void success(pojo response, Response response2) {
                        if(response.getError()==false)
                        {
                            cpb.setProgress(100);
                            Intent intent=new Intent(MainActivity.this,BottomNavigationnew.class);
                            intent.putExtra("name",response.getData().getName());
                            intent.putExtra("libid",response.getData().getLibraryid());
                            intent.putExtra("email",response.getData().getEmail());
                            startActivity(intent);
                        }
                        else
                        {
                            cpb.setProgress(-1);
                        }
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public void onClick(View v) {
            if (cpb.getProgress() == 0)
                cpb.setProgress(30);
            else if (cpb.getProgress() == -1)
                cpb.setProgress(0);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "Please fill all values!", Toast.LENGTH_SHORT).show();
                        cpb.setProgress(0);
                    }
                    else
                    insertuser();
                }
            }, 2000);
    }


}
