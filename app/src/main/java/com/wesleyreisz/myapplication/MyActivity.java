package com.wesleyreisz.myapplication;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;



public class MyActivity extends Activity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);
    }

    @Override
    public void respond(int i) {
        FragmentManager manager=getFragmentManager();
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragmentb);
        fragmentB.changeData(i);
    }
}
