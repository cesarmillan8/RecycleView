package com.millancode.mascotas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getBaseContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        DataSet();
        RecyclerView rvMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        rvMascotas.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        rvMascotas.setLayoutManager(llm);
        Adaptador adapter = new Adaptador(mascotas);
        rvMascotas.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_petagram, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuFav:
                Intent intent = new Intent(MainActivity.this, Detalle.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void DataSet(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.bulldog, "Cochito"));
        mascotas.add(new Mascota(R.drawable.garfield, "Nairo"));
        mascotas.add(new Mascota(R.drawable.collin, "Lassy"));
        mascotas.add(new Mascota(R.drawable.frances, "Pachito"));
        mascotas.add(new Mascota(R.drawable.gato1, "Radamel"));
        mascotas.add(new Mascota(R.drawable.pitbull, "Teo"));
        mascotas.add(new Mascota(R.drawable.nachito, "Nachito"));
    }
}

