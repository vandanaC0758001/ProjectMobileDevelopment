package com.example.assign2;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class movieAdapter extends ArrayAdapter<details> {
    private Context mycontext;
    private int myres;
    public movieAdapter(@NonNull Context context, int resource, @NonNull ArrayList<details> objects) {
        super(context, resource, objects);
        this.mycontext= context;
        this.myres= resource;
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutinflator = LayoutInflater.from(mycontext);
        convertView= layoutinflator.inflate(myres,parent,false);
        ImageView imageview=convertView.findViewById(R.id.image);
        TextView title=convertView.findViewById(R.id.title);
        TextView genre=convertView.findViewById(R.id.genre);
        imageview.setImageResource(getItem(position).getImage());
        title.setText(getItem(position).getTitle());
        genre.setText(getItem(position).getGenre());
        return  convertView;
    }
}
