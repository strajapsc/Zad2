package com.example.zadatak2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText iznosEuro;
    private EditText iznosDolar;
    private EditText kursEuro;
    private  EditText kursDolar;
    private TextView eurouDinar;
    private TextView dolaruDinar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iznosEuro=(EditText) findViewById(R.id.editTextIznosEuro);
        iznosDolar=(EditText) findViewById(R.id.editTextIznosDolar);
        kursEuro=(EditText) findViewById(R.id.editTextKursEura);
        kursDolar=(EditText) findViewById(R.id.editTextKursDolara);
        eurouDinar=(TextView) findViewById(R.id.textViewEuroDinar);
        dolaruDinar=(TextView) findViewById(R.id.textViewDolarDinar);

    }
    public void btnEuro(View view){
        double iznosE=Double.parseDouble(iznosEuro.getText().toString());
        double kursE=Double.parseDouble(kursEuro.getText().toString());
        double rez=iznosE*kursE;
        eurouDinar.setText("Iznos u dinarima je: "+String.valueOf(rez));

    }
    public void btnDolar(View view){
        double iznosD=Double.parseDouble(iznosDolar.getText().toString());
        double kursD=Double.parseDouble(kursDolar.getText().toString());
        double rez=iznosD*kursD;
        dolaruDinar.setText("Iznos u dinarima je: "+String.valueOf(rez));
    }
}