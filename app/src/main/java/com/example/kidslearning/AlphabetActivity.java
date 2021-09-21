package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AlphabetActivity extends AppCompatActivity {


    RecyclerView rclView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);


        rclView = (RecyclerView) findViewById(R.id.rclView);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rclView.setLayoutManager(gridLayoutManager);

        AlphabetAdapter adapter = new AlphabetAdapter(dataqueue(),getApplicationContext());
        rclView.setAdapter(adapter);

    }


    // creating function for data

    public ArrayList<AlphabetModel> dataqueue() {
        ArrayList<AlphabetModel> holder = new ArrayList<>();

        AlphabetModel obj1 = new AlphabetModel();
        obj1.setImageName(" A ");
        obj1.setImg(R.drawable.apple);
        holder.add(obj1);

        AlphabetModel obj2 = new AlphabetModel();
        obj2.setImageName(" B ");
        obj2.setImg(R.drawable.ball);
        holder.add(obj2);

        AlphabetModel obj3 = new AlphabetModel();
        obj3.setImageName(" C ");
        obj3.setImg(R.drawable.cat);
        holder.add(obj3);

        AlphabetModel obj4 = new AlphabetModel();
        obj4.setImageName(" D ");
        obj4.setImg(R.drawable.dog);
        holder.add(obj4);

        AlphabetModel obj5 = new AlphabetModel();
        obj5.setImageName(" E ");
        obj5.setImg(R.drawable.elephant);
        holder.add(obj5);

        AlphabetModel obj6 = new AlphabetModel();
        obj6.setImageName(" F ");
        obj6.setImg(R.drawable.fish);
        holder.add(obj6);

        AlphabetModel obj7 = new AlphabetModel();
        obj7.setImageName(" G ");
        obj7.setImg(R.drawable.goat);
        holder.add(obj7);

        AlphabetModel obj8 = new AlphabetModel();
        obj8.setImageName(" H ");
        obj8.setImg(R.drawable.hat);
        holder.add(obj8);

        AlphabetModel obj9 = new AlphabetModel();
        obj9.setImageName(" I ");
        obj9.setImg(R.drawable.insect);
        holder.add(obj9);

        AlphabetModel obj10 = new AlphabetModel();
        obj10.setImageName(" J ");
        obj10.setImg(R.drawable.jug);
        holder.add(obj10);

        AlphabetModel obj11 = new AlphabetModel();
        obj11.setImageName(" K ");
        obj11.setImg(R.drawable.king);
        holder.add(obj11);

        AlphabetModel obj12 = new AlphabetModel();
        obj12.setImageName(" L ");
        obj12.setImg(R.drawable.lamb);
        holder.add(obj12);

        AlphabetModel obj13 = new AlphabetModel();
        obj13.setImageName(" M ");
        obj13.setImg(R.drawable.monkey);
        holder.add(obj13);

        AlphabetModel obj14 = new AlphabetModel();
        obj14.setImageName(" N ");
        obj14.setImg(R.drawable.nose);
        holder.add(obj14);

        AlphabetModel obj15 = new AlphabetModel();
        obj15.setImageName(" O ");
        obj15.setImg(R.drawable.oar);
        holder.add(obj15);

        AlphabetModel obj16 = new AlphabetModel();
        obj16.setImageName(" P ");
        obj16.setImg(R.drawable.parrot);
        holder.add(obj16);

        AlphabetModel obj17 = new AlphabetModel();
        obj17.setImageName(" Q ");
        obj17.setImg(R.drawable.queen);
        holder.add(obj17);

        AlphabetModel obj18 = new AlphabetModel();
        obj18.setImageName(" R ");
        obj18.setImg(R.drawable.rat);
        holder.add(obj18);

        AlphabetModel obj19 = new AlphabetModel();
        obj19.setImageName(" S ");
        obj19.setImg(R.drawable.sunflower);
        holder.add(obj19);

        AlphabetModel obj20 = new AlphabetModel();
        obj20.setImageName(" T ");
        obj20.setImg(R.drawable.tub);
        holder.add(obj20);

        AlphabetModel obj21 = new AlphabetModel();
        obj21.setImageName(" U ");
        obj21.setImg(R.drawable.umberella);
        holder.add(obj21);

        AlphabetModel obj22 = new AlphabetModel();
        obj22.setImageName(" V ");
        obj22.setImg(R.drawable.violin);
        holder.add(obj22);

        AlphabetModel obj23 = new AlphabetModel();
        obj23.setImageName(" W ");
        obj23.setImg(R.drawable.well);
        holder.add(obj23);

        AlphabetModel obj24 = new AlphabetModel();
        obj24.setImageName(" X ");
        obj24.setImg(R.drawable.xfox);
        holder.add(obj24);

        AlphabetModel obj25 = new AlphabetModel();
        obj25.setImageName(" Y ");
        obj25.setImg(R.drawable.yacht);
        holder.add(obj25);

        AlphabetModel obj26 = new AlphabetModel();
        obj26.setImageName(" Z ");
        obj26.setImg(R.drawable.zoo);
        holder.add(obj26);


        return holder;
    }

}