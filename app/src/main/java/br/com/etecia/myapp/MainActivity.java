package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Livros> lstLivros;
    RecyclerView idRecLivros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        idRecLivros = findViewById(R.id.idRecLivros);

        lstLivros = new ArrayList<>();

        lstLivros.add(new Livros("A Metamorfose", "Drama", R.drawable.metamorfose, 12.99));
        lstLivros.add(new Livros("Diário de um Banana 1", "Comédia", R.drawable.diariodeumbanana, 46.46));
        lstLivros.add(new Livros("O Pequeno Príncipe", "Ficção Científica", R.drawable.pequenoprincipe, 13.20));
        lstLivros.add(new Livros("Cinquenta Tons de Cinza", "Romance", R.drawable.cinquentatonsdecinza, 54.45));
        lstLivros.add(new Livros("A Guerra dos Tronos", "Ficção Científica", R.drawable.aguerradostronos, 78.11));
        lstLivros.add(new Livros("A psicologia financeira", "Autoajuda", R.drawable.psicologiafinanceira, 29.88));

        AdapterLivros adapterLivros = new AdapterLivros(getApplicationContext(), lstLivros);

        idRecLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecLivros.setAdapter(adapterLivros);

    }
}