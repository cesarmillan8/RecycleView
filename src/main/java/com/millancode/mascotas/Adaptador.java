package com.millancode.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MascotaViewHolder> {

    List<Mascota> mascotas;

    Adaptador(List<Mascota> mascotas){
        this.mascotas = mascotas;
    }
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mascotas, viewGroup, false);
        MascotaViewHolder mascotaViewHolder = new MascotaViewHolder(v);
        return mascotaViewHolder;
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        mascotaViewHolder.ivFoto.setImageResource(mascotas.get(position).getnMascota());
        mascotaViewHolder.tvMascota.setText(mascotas.get(position).getNombre());

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        CardView cvMascota;
        TextView tvMascota;
        ImageView ivFoto;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            cvMascota = (CardView)itemView.findViewById(R.id.cardViewMascota);
            tvMascota = (TextView)itemView.findViewById(R.id.tvMascota);
            ivFoto = (ImageView)itemView.findViewById(R.id.ivFoto);
        }
    }
}
