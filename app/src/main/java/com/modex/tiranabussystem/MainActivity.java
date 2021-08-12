package com.modex.tiranabussystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView moreInfoView, zonatVeriore,
            zonatJugore,urbaniTirane, taksiteTirane, oraretRretheve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moreInfoView = findViewById(R.id.moreInfoView);
        zonatVeriore = findViewById(R.id.zonatVeriore);
        zonatJugore = findViewById(R.id.zonatJugore);
        urbaniTirane = findViewById(R.id.urbaniTirane);
        taksiteTirane = findViewById(R.id.taksiteTirane);
        oraretRretheve = findViewById(R.id.oraretRetheve);

        zonatVeriore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ZonatVeriore.class);
                startActivity(intent);
            }
        });

        zonatJugore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ZonatJugore.class);
                startActivity(intent);
            }
        });


    }
}