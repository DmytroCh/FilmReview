package com.example.user.filmreview.detailActivity;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.filmreview.Film;
import com.example.user.filmreview.MainActivity;
import com.example.user.filmreview.R;

import static android.content.res.Configuration.ORIENTATION_LANDSCAPE;

public class DetailActivity extends AppCompatActivity {

    private ImageView topImage;
    private TextView title;
    private TextView category;
    private ViewPager viewPager;
    private FragmentAdapter fragmentAdapter;
    private Film film;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation != ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_detail_portrait);
        else
            setContentView(R.layout.activity_detail_landscape);
         film = (Film) getIntent().getSerializableExtra("Film");

        //Initialization
        viewPager = (ViewPager) findViewById(R.id.pager);
        title = (TextView) findViewById(R.id.title);
        category = (TextView) findViewById(R.id.category);
        topImage = (ImageView) findViewById(R.id.icon);

        //set datas
        title.setText(film.getTitle());
        category.setText(film.getCategory());
        int id = getResources().getIdentifier(film.getImageName(), "drawable", MainActivity.PACKAGE_NAME);
        topImage.setImageResource(id);

        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);
    }
    public Film getFilm(){
        return film;
    }

}
