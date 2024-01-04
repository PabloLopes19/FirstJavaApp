package com.example.primeiroappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity        {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Random rand = new Random();

    @SuppressLint("SetTextI18n")
    public void pegarNumeroAleatorio() {
        TextView labelResultado = findViewById(R.id.textoResultado);
        int numeroSelecionado = rand.nextInt(10);

        labelResultado.setText("O número selecionado é: " + numeroSelecionado);
    }
}