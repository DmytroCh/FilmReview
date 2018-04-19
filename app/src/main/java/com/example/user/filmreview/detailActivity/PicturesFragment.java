package com.example.user.filmreview.detailActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.user.filmreview.Film;
import com.example.user.filmreview.MainActivity;
import com.example.user.filmreview.R;

import java.util.ArrayList;

/**
 * Created by User on 17.04.2018.
 */

public class PicturesFragment extends Fragment {

    ArrayList<ImageView> list = new ArrayList<>();
    private Bitmap myBitmap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Film film = (Film) getActivity().getIntent().getSerializableExtra("Film");
        View rootView = inflater.inflate(R.layout.pictures_fragment, container, false);

        list.add((ImageView)rootView.findViewById(R.id.image1));
        list.add((ImageView)rootView.findViewById(R.id.image2));
        list.add((ImageView)rootView.findViewById(R.id.image3));
        list.add((ImageView)rootView.findViewById(R.id.image4));
        list.add((ImageView)rootView.findViewById(R.id.image5));
        list.add((ImageView)rootView.findViewById(R.id.image6));

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;



        int id;
        for(int i = 0; i < list.size();i++){
            id = getResources().getIdentifier(film.getImageName() +"_" + (i+1), "drawable", MainActivity.PACKAGE_NAME);
            myBitmap = BitmapFactory.decodeResource(getResources(), id, options);
            list.get(i).setImageBitmap(myBitmap);
        }

        return rootView;
    }
}
