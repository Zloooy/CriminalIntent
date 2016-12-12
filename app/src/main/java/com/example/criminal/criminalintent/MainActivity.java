package com.example.criminal.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        Fragment frgm=fm.findFragmentById(R.id.fmcnt);
        if (frgm==null){
            frgm=new CrimeFragment();
            fm.beginTransaction().add(R.id.fmcnt,frgm).commit();
        }
    }
}
