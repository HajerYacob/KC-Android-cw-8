package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Bundle bundle = getIntent().getExtras();
      Fruit deliveryfruit = (Fruit) bundle.getSerializable("fruit");


        ImageView imageicon = findViewById(R.id.imageicon);
        TextView textview  = findViewById(R.id.textview);
        TextView textvie = findViewById(R.id.textvie);


      imageicon.setImageResource(deliveryfruit.getFruitimage());
        textview.setText(deliveryfruit.getFruitName());
        textvie.setText(deliveryfruit.getFruitColor());

    }
}