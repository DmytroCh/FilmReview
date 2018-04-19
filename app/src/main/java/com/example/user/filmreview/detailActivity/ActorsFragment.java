package com.example.user.filmreview.detailActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.filmreview.Config;
import com.example.user.filmreview.Film;
import com.example.user.filmreview.R;

/**
 * Created by User on 17.04.2018.
 */

public class ActorsFragment extends Fragment {
    private RecyclerView recyclerView;
    private View rootView;
    private Film film;
    private ActorsAdapter actorsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initializeVariables(inflater, container);

        workOnRecyclerView();

        return rootView;
    }

    private void initializeVariables(LayoutInflater inflater, ViewGroup container) {
        rootView = inflater.inflate(R.layout.actors_fragment, container, false);
        recyclerView = (RecyclerView)rootView.findViewById(R.id.actors);
        film = (Film) getActivity().getIntent().getSerializableExtra(Config.FILMINSTANTNAME);
        actorsAdapter = new ActorsAdapter(film.getActors(), recyclerView);
    }

    private void workOnRecyclerView(){
        // w celach optymalizacji
        recyclerView.setHasFixedSize(true);

        // ustawiamy LayoutManagera
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // ustawiamy animatora, który odpowiada za animację dodania/usunięcia elementów listy
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(actorsAdapter);
    }
}
