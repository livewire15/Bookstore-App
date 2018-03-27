package com.example.intel.innoprojnew2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.intel.innoprojnew2.Fragments.BorrowZone;
import com.example.intel.innoprojnew2.Fragments.DashboardFragment;
import com.example.intel.innoprojnew2.Fragments.LibraryBooksFragment;
import com.example.intel.innoprojnew2.Fragments.MyBooks;

public class BottomNavigationnew extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.dashboard:
                    setTitle("Dashboard");//title of home fragment action bar
                    DashboardFragment homefragment=new DashboardFragment();
                    FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.container,homefragment,"Dashboard Fragment");//frame is th id of frame layout in xml
                    fragmentTransaction1.commit();//remember to commit fragment
                    return true;
                case R.id.library_books:
                    setTitle("Library Books");
                    LibraryBooksFragment libraryBooksFragment=new LibraryBooksFragment();
                    FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.container,libraryBooksFragment,"Library Books Fragment");
                    fragmentTransaction2.commit();
                    return true;
                case R.id.borrow_zone:
                    setTitle("Borrow Zone");
                    BorrowZone borrowZone=new BorrowZone();
                    FragmentTransaction fragmentTransaction3=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.container,borrowZone,"Library Books Fragment");
                    fragmentTransaction3.commit();
                    return true;
                case R.id.my_books:
                    setTitle("My Books");
                    MyBooks mybooks=new MyBooks();
                    FragmentTransaction fragmentTransaction4=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction4.replace(R.id.container,mybooks,"Library Books Fragment");
                    fragmentTransaction4.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigationnew);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        DashboardFragment homefragment=new DashboardFragment();
        FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.container,homefragment,"Home Fragment");//frame is th id of frame layout in xml
        fragmentTransaction1.commit();//remember to commit fragment
        setTitle("Dashboard");//title of home fragment action bar
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_fragment,menu);
        return true;
    }
}
