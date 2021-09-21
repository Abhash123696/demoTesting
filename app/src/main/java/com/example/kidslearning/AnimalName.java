package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AnimalName extends AppCompatActivity {

    RecyclerView rclView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);


        rclView2 = findViewById(R.id.rclView2);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rclView2.setLayoutManager(gridLayoutManager);


        AlphabetAdapter adapter = new AlphabetAdapter(dataqueue(), getApplicationContext());
        rclView2.setAdapter(adapter);


    }


    public ArrayList<AlphabetModel> dataqueue() {
        ArrayList<AlphabetModel> holder = new ArrayList<>();

        AlphabetModel obj1 = new AlphabetModel();
        obj1.setImageName(" Bull ");
        obj1.setImg(R.drawable.bull);
        holder.add(obj1);

        AlphabetModel obj2 = new AlphabetModel();
        obj2.setImageName(" Buffalo ");
        obj2.setImg(R.drawable.buffalo);
        holder.add(obj2);

        AlphabetModel obj3 = new AlphabetModel();
        obj3.setImageName(" Bear ");
        obj3.setImg(R.drawable.bear);
        holder.add(obj3);

        AlphabetModel obj4 = new AlphabetModel();
        obj4.setImageName(" Cow ");
        obj4.setImg(R.drawable.cow);
        holder.add(obj4);

        AlphabetModel obj5 = new AlphabetModel();
        obj5.setImageName(" Elephant ");
        obj5.setImg(R.drawable.elephant);
        holder.add(obj5);

        AlphabetModel obj6 = new AlphabetModel();
        obj6.setImageName(" Girrafe ");
        obj6.setImg(R.drawable.girrafe);
        holder.add(obj6);


        AlphabetModel obj7 = new AlphabetModel();
        obj6.setImageName(" Kangaroo ");
        obj6.setImg(R.drawable.kangaroo);
        holder.add(obj6);


        AlphabetModel obj8 = new AlphabetModel();
        obj6.setImageName(" Lion ");
        obj6.setImg(R.drawable.lion);
        holder.add(obj6);


        AlphabetModel obj9 = new AlphabetModel();
        obj6.setImageName(" Tiger ");
        obj6.setImg(R.drawable.tiger);
        holder.add(obj6);


        AlphabetModel obj10 = new AlphabetModel();
        obj6.setImageName(" Zebra ");
        obj6.setImg(R.drawable.zebra);
        holder.add(obj6);

        return holder;

    }

}