package com.modex.tiranabussystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog simulatorDialog;
    TextView titleTv, messageTv;
    ImageView close;
    Button btnAccept;

    ImageView zonatVeriore,
            zonatJugore, urbaniTirane, taksiteTirane, oraretRretheve, oraretTirane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        zonatVeriore = findViewById(R.id.zonatVeriore);
        zonatJugore = findViewById(R.id.zonatJugore);
        urbaniTirane = findViewById(R.id.urbaniTirane);
        taksiteTirane = findViewById(R.id.taksiteTirane);
        oraretRretheve = findViewById(R.id.oraretRetheve);
        oraretTirane = findViewById(R.id.oraretTirane);
        simulatorDialog = new Dialog(this);

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

        taksiteTirane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TaksiteTirane.class);
                startActivity(intent);
            }
        });


        urbaniTirane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UrbaniTirane.class);
                startActivity(intent);
            }
        });

        oraretRretheve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OraretRretheve.class);
                startActivity(intent);
            }
        });

        oraretTirane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSimulatorActivity();
            }
        });


    }

    public void openSimulatorActivity() {
        simulatorDialog.setContentView(R.layout.activity_oraret_tirane);
        ImageView close = simulatorDialog.findViewById(R.id.popUpClose);
//        Button btnAccept = simulatorDialog.findViewById(R.id.buttonAccept);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simulatorDialog.dismiss();

            }
        });
        simulatorDialog.show();

    }
}