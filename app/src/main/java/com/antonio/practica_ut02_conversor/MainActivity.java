package com.antonio.practica_ut02_conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convertir (View view) {

        EditText cantidadEuros = findViewById(R.id.edit_cantidad);

        Double cantidadDollars = Double.parseDouble(cantidadEuros.getText().toString());

        Double dollars = cantidadDollars * 1.2266;

        EditText resultado = findViewById(R.id.edit_resultado);

        resultado.setText("Total: " + (String.valueOf(dollars)));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
