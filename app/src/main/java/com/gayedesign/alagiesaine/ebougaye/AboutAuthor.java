package com.gayedesign.alagiesaine.ebougaye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class AboutAuthor extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_author);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
