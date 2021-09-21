package com.example.kidslearning;


import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlphabetActivityViewHolder extends RecyclerView.ViewHolder {

    // Here we taking  reference of of single_alphabet_design.xml

    ImageView img1;
    TextView txt1;


    public AlphabetActivityViewHolder(@NonNull View itemView) {
        super(itemView);

        img1 = (ImageView) itemView.findViewById(R.id.img1);
        txt1 = (TextView) itemView.findViewById(R.id.txt1);


    }
}
