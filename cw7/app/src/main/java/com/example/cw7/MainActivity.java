package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruitslist = new ArrayList<>();
   // MainActivity ma = new MainActivity();


    String fruitlist [] = {"apple" , "bnana" ,"apricot","orange"};
    int  fruitImage [] = {R.drawable.apple,R.drawable.banana,R.drawable.aripcot,R.drawable.orange};
    ListView listView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // data source
        Fruit apple = new Fruit(" apple ", " Red ", R.drawable.apple);
        Fruit bnana = new Fruit(" banana ", " yellow ", R.drawable.banana);
        Fruit aripcot = new Fruit(" aripcot ", " Orenge ", R.drawable.aripcot);
        Fruit orange = new Fruit(" orange ", " Orange ", R.drawable.orange);

        fruitslist.add(apple);
        fruitslist.add(bnana);
        fruitslist.add(aripcot);
        fruitslist.add(orange);


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.


        //listaAdptor
        FruitAdapter fruitAdptor = new FruitAdapter(this,0, fruitslist);
        listView = (ListView) findViewById(R.id.customList);
        listView.setAdapter(fruitAdptor);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruitcurrent = fruitslist.get(position);
                Intent i = new Intent(MainActivity.this,DetailsActivity.class) ;
                i.putExtra(" fruit ",fruitcurrent);

   startActivity(i);


            }
        });





    }
}