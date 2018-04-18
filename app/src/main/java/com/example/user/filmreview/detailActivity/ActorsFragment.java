package com.example.user.filmreview.detailActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.filmreview.R;

/**
 * Created by User on 17.04.2018.
 */

public class ActorsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.actors_fragment, container, false);

        return rootView;
    }
}
