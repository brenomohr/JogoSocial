package com.example.jogosocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Quembebe extends Chacoalha {

    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quembebe);

        //exibe o nome sorteado e qtos shots terá de tomar
        textViewResultado = findViewById(R.id.textViewResultado);

        Intent intent = getIntent();
        if (intent != null) {
            String nomeSorteado = intent.getStringExtra("nome_sorteado");
            textViewResultado.setText(nomeSorteado);
        }
    }
}
