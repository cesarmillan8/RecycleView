package com.millancode.mascotas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Detalle extends AppCompatActivity{

    private List<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getBaseContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DataSet();
        RecyclerView rvMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        rvMascotas.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        rvMascotas.setLayoutManager(llm);
        Adaptador adapter = new Adaptador(mascotas);
        rvMascotas.setAdapter(adapter);
    }

    private void DataSet(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.collin, "Lassy"));
        mascotas.add(new Mascota(R.drawable.bulldog, "Cochito"));
        mascotas.add(new Mascota(R.drawable.pitbull, "Teo"));
        mascotas.add(new Mascota(R.drawable.garfield, "Nairo"));
        mascotas.add(new Mascota(R.drawable.nachito, "Nachito"));
    }
}
