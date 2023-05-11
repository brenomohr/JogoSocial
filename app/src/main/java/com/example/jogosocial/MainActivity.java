package com.example.jogosocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<String> nomesList;
    private Button buttonGravar;

    private EditText editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNome = findViewById(R.id.editTextNome);
        buttonGravar = findViewById(R.id.buttonGravar);

        // cria lista de nomes
        nomesList = new ArrayList<>();
        //começa o jogo e grava lista de nomes
        buttonGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                if (!nome.isEmpty()) {
                    nomesList.add(nome);
                    editTextNome.setText("");
                }
            }
        });
    }
    //realiza o sorteio

    public void realizarSorteio(View view) {
        if (nomesList.size() > 0) {
            Random random = new Random();
            int index = random.nextInt(nomesList.size());

            String nomeSorteado = nomesList.get(index);

            Intent intent = new Intent(this, Chacoalha.class);
            intent.putExtra("nome_sorteado", nomeSorteado);
            startActivity(intent);
        }
    }
}