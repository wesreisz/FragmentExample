package com.wesleyreisz.myapplication;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wesleyreisz on 10/20/14.
 */
public class FragmentB extends Fragment {
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentb,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView = (TextView) getActivity().findViewById(R.id.textView);
    }

    public void changeData(int i) {
        Resources res = getResources();
        String[] descriptions  = res.getStringArray(R.array.description);
        textView.setText(descriptions[i]);
    }
}
