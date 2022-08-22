package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;



public class FruitAdapter extends ArrayAdapter<Fruit> {

    List<Fruit> fruitList;


    public FruitAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);

        fruitList= objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         View view = LayoutInflater.from(getContext()).inflate(R.layout.item, parent,false);

          Fruit currentfruit = fruitList.get(position);

        TextView name = view.findViewById(R.id.textview);
        ImageView picfruit = view.findViewById(R.id.imageicon);
        TextView color = view.findViewById(R.id.textvie);

              name.setText(currentfruit.getFruitName());
              color.setText(currentfruit.getFruitName());
              picfruit.setImageResource(currentfruit.getFruitimage());


//delete code !
         ImageView del = view.findViewById(R.id.imageView) ;
              del.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                   fruitList.remove(position);
                      notifyDataSetChanged();
                  }
              });

        return view;

    }
}
