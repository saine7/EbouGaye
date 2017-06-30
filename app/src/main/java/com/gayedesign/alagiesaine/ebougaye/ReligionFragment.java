package com.gayedesign.alagiesaine.ebougaye;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class ReligionFragment extends Fragment {
    public int showDetails(){
        return getArguments().getInt("position");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        ScrollView scrollView = new ScrollView(getActivity());
        TextView textView = new TextView(getActivity());

        int padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,12,getResources().getDisplayMetrics());
        textView.setPadding(padding,padding,padding,padding);
        textView.setText(Html.fromHtml(Religion.RELIGION_DETAILS[showDetails()]));
        textView.setTypeface(Typeface.SERIF);
        scrollView.addView(textView);

        return scrollView;
    }

}
