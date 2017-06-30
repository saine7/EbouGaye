package com.gayedesign.alagiesaine.ebougaye;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fragmentManager = getSupportFragmentManager();
        ft = fragmentManager.beginTransaction();

        if (savedInstanceState == null){
            DetailsFragment details = new DetailsFragment();
            details.setArguments(getIntent().getExtras());
            ft.add(android.R.id.content,details).commit();
        }

    }
}
