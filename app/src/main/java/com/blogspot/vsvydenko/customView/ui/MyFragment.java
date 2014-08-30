package com.blogspot.vsvydenko.customView.ui;

import com.blogspot.vsvydenko.customView.R;
import com.blogspot.vsvydenko.customView.widget.ClockView;
import com.blogspot.vsvydenko.customView.widget.ClockViewSurface;
import com.blogspot.vsvydenko.customView.widget.CompassView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ShareActionProvider;

/**
 * Created by vsvydenko on 29.08.14.
 */
public class MyFragment extends Fragment {

    private View returnView;
    private ClockViewSurface mClockViewSurface;
    private ClockView mClockView;

    public MyFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        returnView = inflater.inflate(R.layout.fragment_my, container, false);
        return returnView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initializeContent();
    }

    private void initializeContent(){
        mClockViewSurface = (ClockViewSurface) returnView.findViewById(R.id.clockView);
        //mClockView = (ClockView) returnView.findViewById(R.id.clockView);
        //CompassView cv = (CompassView)returnView.findViewById(R.id.compassView);
        //cv.setBearing(0);
    }

    @Override
    public void onCreateOptionsMenu(
            Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.my, menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_12_hours:
                mClockViewSurface.setClockFormat(12);
                return true;
            case R.id.action_24_hours:
                mClockViewSurface.setClockFormat(24);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
