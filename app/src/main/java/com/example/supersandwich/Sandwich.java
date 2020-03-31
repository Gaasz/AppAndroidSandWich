package com.example.supersandwich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends AppCompatActivity  implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private List<Modelo> mLista=new ArrayList<>();
    ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);

        mListView=findViewById(R.id.listView);
        mListView.setOnItemClickListener(this);

        mLista.add(new Modelo("Lomito Italinao","3500","Delicioso sandwich de lomo de cerdo con tomate, palta y mayo",R.mipmap.ic_lomito_round));
        mLista.add(new Modelo("Churrasco Italinao","3500","Delicioso sandwich de churrasco de cerdo con tomate, palta y mayo",R.mipmap.ic_churrasco_round));
        mLista.add(new Modelo("Sandwich de Seitan","4000","Delicioso sandwich Vegano en base a Seitan con lechuga, tomate, pepino y mayo vegana ",R.mipmap.ic_seitan_round));
        mLista.add(new Modelo("Hamburguesa con Queso","4000","Delicioso Hamburguesa con queso, tomate, lechuga, pepinillos y tocino",R.mipmap.ic_hamburguesa_round));
        mLista.add(new Modelo("Barros Luco","3000","Delicioso sandwich de lcarne a la plancha con queso",R.mipmap.ic_barros_round));



        mAdapter =new ListAdapter(Sandwich.this,R.layout.item_row, mLista);


        mListView.setAdapter(mAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Hiciste click a:"+position, Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, Pancitos.class);
        intent.putExtra("nombre",mAdapter.getItem(position).getNombre());
        intent.putExtra("image",mAdapter.getItem(position).getImage());
        intent.putExtra("descripcion",mAdapter.getItem(position).getDescripcion());
        intent.putExtra("precio",mAdapter.getItem(position).getPrecio());
        startActivity(intent);
    }
}
