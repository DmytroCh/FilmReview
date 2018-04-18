package com.example.user.filmreview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.filmreview.detailActivity.DetailActivity;

import java.util.ArrayList;

/**
 * Created by User on 15.04.2018.
 */

public class MyAdapter extends RecyclerView.Adapter{

    // źródło danych
    private ArrayList<Film> listFilm = new ArrayList<>();

    // obiekt listy
    private RecyclerView mRecyclerView;

    //context ViewHoldera
    private Context context;

    // konstruktor adaptera
    public MyAdapter(ArrayList<Film> list, RecyclerView pRecyclerView){
        listFilm = list;
        mRecyclerView = pRecyclerView;
    }

    // implementacja wzorca ViewHolder
    // każdy obiekt tej klasy przechowuje odniesienie do layoutu elementu listy
    // dzięki temu wywołujemy findViewById() tylko raz dla każdego elementu
    private class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView title;
        public TextView category;

        public MyViewHolder(View pItem) {
            super(pItem);
            context = itemView.getContext();
            icon = (ImageView) pItem.findViewById(R.id.icon);
            title = (TextView) pItem.findViewById(R.id.title);
            category = (TextView) pItem.findViewById(R.id.category);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int i) {
        // tworzymy layout filmu oraz obiekt ViewHoldera
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.film_layout, viewGroup, false);

        final MyViewHolder myViewHolder = new MyViewHolder(view);


        // dla elementu listy ustawiamy obiekt OnClickListener,
        // który otworzy activity dla elementu z listy po kliknięciu na niego
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Film", listFilm.get(myViewHolder.getAdapterPosition()));
                context.startActivity(intent);
            }
        });
        // tworzymy i zwracamy obiekt ViewHolder
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        //uzupełniamy layout filmu
        Film film = listFilm.get(i);
        int id = mRecyclerView.getResources().getIdentifier(film.getImageName(), "drawable", MainActivity.PACKAGE_NAME);
        ((MyViewHolder) viewHolder).icon.setImageResource(id);
        ((MyViewHolder) viewHolder).title.setText(film.getTitle());
        ((MyViewHolder) viewHolder).category.setText(film.getCategory());
    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    public void removeAt(int position){
        listFilm.remove(position);
        notifyItemRemoved(position);
    }
}
