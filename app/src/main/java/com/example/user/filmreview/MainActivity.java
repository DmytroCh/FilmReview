package com.example.user.filmreview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;

public class MainActivity extends AppCompatActivity {
    public static String PACKAGE_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PACKAGE_NAME = getPackageName();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.films);

        // w celach optymalizacji
        recyclerView.setHasFixedSize(true);

        // ustawiamy LayoutManagera
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // ustawiamy animatora, który odpowiada za animację dodania/usunięcia elementów listy
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // dodajemy do listy filmy
        for(int i = 0; i < 10; i++){
            Config.list.add(new Film("Film" + i, "Kategoria" + i, "nietykalni_logo.jpg"));
        }
        recyclerView.setAdapter(new MyAdapter(Config.list, recyclerView));
    }
}
