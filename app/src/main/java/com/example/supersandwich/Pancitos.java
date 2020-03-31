package com.example.supersandwich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Pancitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancitos2);

        TextView textView=findViewById(R.id.textViewNombre);
       TextView textView2=findViewById(R.id.textViewPrecio);
      TextView textView3=findViewById(R.id.textViewDescripcion);
        ImageView image =findViewById(R.id.imagePancito);


         textView.setText(getIntent().getStringExtra("nombre"));
       textView2.setText(getIntent().getStringExtra("precio"));
         textView3.setText(getIntent().getStringExtra("descripcion"));
         image.setImageResource(getIntent().getIntExtra("image",0));
    }
}
