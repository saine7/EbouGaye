package com.gayedesign.alagiesaine.ebougaye;


import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preference extends PreferenceActivity{
    @Override
    @SuppressWarnings("deprecation")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addPreferencesFromResource(R.xml.preference);
    }
}
