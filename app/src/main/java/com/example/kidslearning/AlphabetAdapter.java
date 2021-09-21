package com.example.kidslearning;


import android.content.Context;
import android.content.Loader;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.ArrayList;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetActivityViewHolder> {

    ArrayList<AlphabetModel> data;
    Context context;
    public MediaPlayer mPlayer;
    boolean isPlaying = true;


    public AlphabetAdapter(ArrayList<AlphabetModel> data, Context context) {
        this.data = data;
        this.context = context;
    }


    @NonNull
    @Override
    public AlphabetActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_alphabet_design, parent, false);
        return new AlphabetActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlphabetActivityViewHolder holder, int position) {

        final AlphabetModel temp = data.get(position);

        // now we take holder
        holder.txt1.setText(data.get(position).getImageName());
        holder.img1.setImageResource(data.get(position).getImg());

        holder.txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (holder.getAbsoluteAdapterPosition() == 0) {
                    MediaPlayer apple = MediaPlayer.create(context, R.raw.a_for_apple);
                    apple.start();


                } else if (holder.getAbsoluteAdapterPosition() == 1) {
                    MediaPlayer ball = MediaPlayer.create(context, R.raw.b_for_ball);
                    ball.start();


                } else if (holder.getAbsoluteAdapterPosition() == 2) {
                    mPlayer = MediaPlayer.create(context, R.raw.c_for_cat);
                    mPlayer.start();

                } else if (holder.getAbsoluteAdapterPosition() == 3) {
                    mPlayer = MediaPlayer.create(context, R.raw.d_for_dog);
                    mPlayer.start();

                } else if (holder.getAbsoluteAdapterPosition() == 4) {
                    mPlayer = MediaPlayer.create(context, R.raw.e_for_elephant);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 5) {
                    mPlayer = MediaPlayer.create(context, R.raw.f_for_fish);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 6) {
                    mPlayer = MediaPlayer.create(context, R.raw.g_for_goat);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 7) {
                    mPlayer = MediaPlayer.create(context, R.raw.h_for_hat);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 8) {
                    mPlayer = MediaPlayer.create(context, R.raw.i_for_insect);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 9) {
                    mPlayer = MediaPlayer.create(context, R.raw.j_for_jug);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 10) {
                    mPlayer = MediaPlayer.create(context, R.raw.k_for_king);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 11) {
                    mPlayer = MediaPlayer.create(context, R.raw.l_for_lamb);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 12) {
                    mPlayer = MediaPlayer.create(context, R.raw.m_for_monkey);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 13) {
                    mPlayer = MediaPlayer.create(context, R.raw.n_for_nose);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 14) {
                    mPlayer = MediaPlayer.create(context, R.raw.o_for_oar);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 15) {
                    mPlayer = MediaPlayer.create(context, R.raw.p_for_parrot);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 16) {
                    mPlayer = MediaPlayer.create(context, R.raw.q_for_queen);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 17) {
                    mPlayer = MediaPlayer.create(context, R.raw.r_for_rat);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 18) {
                    mPlayer = MediaPlayer.create(context, R.raw.s_for_sunflower);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 19) {
                    mPlayer = MediaPlayer.create(context, R.raw.t_for_tub);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 20) {
                    mPlayer = MediaPlayer.create(context, R.raw.u_for_umberella);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 21) {
                    mPlayer = MediaPlayer.create(context, R.raw.v_for_violin);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 22) {
                    mPlayer = MediaPlayer.create(context, R.raw.w_for_well);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 23) {
                    mPlayer = MediaPlayer.create(context, R.raw.x_for_x);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 24) {
                    mPlayer = MediaPlayer.create(context, R.raw.y_for_yak);
                    mPlayer.start();
                } else if (holder.getAbsoluteAdapterPosition() == 25) {
                    mPlayer = MediaPlayer.create(context, R.raw.z_for_zoo);
                    mPlayer.start();
                }


            }
        });


    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
