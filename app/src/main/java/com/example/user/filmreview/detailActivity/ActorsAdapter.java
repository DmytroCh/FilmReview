package com.example.user.filmreview.detailActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.user.filmreview.MainActivity;
import com.example.user.filmreview.R;

import java.util.ArrayList;

/**
 * Created by User on 19.04.2018.
 */

public class ActorsAdapter extends RecyclerView.Adapter{

    // źródło danych
    private ArrayList<Actor> listActor = new ArrayList<>();

    // obiekt listy
    private RecyclerView mRecyclerView;

    private Bitmap myBitmap;


    // konstruktor adaptera
    public ActorsAdapter(ArrayList<Actor> list, RecyclerView pRecyclerView){
        listActor = list;
        mRecyclerView = pRecyclerView;
    }

    // implementacja wzorca ViewHolder
    // każdy obiekt tej klasy przechowuje odniesienie do layoutu elementu listy
    // dzięki temu wywołujemy findViewById() tylko raz dla każdego elementu
    private class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView name;
        public TextView surname;
        public TextView age;


        public MyViewHolder(View pItem) {
            super(pItem);
            icon = (ImageView) pItem.findViewById(R.id.actor_icon);
            name = (TextView) pItem.findViewById(R.id.name);
            surname = (TextView) pItem.findViewById(R.id.surname);
            age = (TextView) pItem.findViewById(R.id.age);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // tworzymy layout aktora oraz obiekt ViewHoldera
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.actor_layout, viewGroup, false);

        final MyViewHolder myViewHolder = new MyViewHolder(view);

        // tworzymy i zwracamy obiekt ViewHolder
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //uzupełniamy layout aktora
        Actor actor = listActor.get(position);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        int id = mRecyclerView.getResources().getIdentifier(actor.getImage(), "drawable", MainActivity.PACKAGE_NAME);
        myBitmap = BitmapFactory.decodeResource(mRecyclerView.getResources(), id, options);
        ((ActorsAdapter.MyViewHolder) holder).icon.setImageBitmap(myBitmap);
        ((MyViewHolder) holder).name.setText(actor.getName());
        ((MyViewHolder) holder).surname.setText(actor.getSurname());
        ((MyViewHolder) holder).age.setText(Integer.toString(actor.getAge()));
    }

    @Override
    public int getItemCount() {
        return listActor.size();
    }
}
