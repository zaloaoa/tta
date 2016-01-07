package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.EjerciciosActivity;
import es.tta.guztiokeuskarapp.example.presentation.DataLexikoniveldos;

public class NivelesLexikoActivity extends AppCompatActivity {

    public final static String EXTRA_DATA_LEX_DOS ="es.tta.guztiokeuskarapp.datalexikoniveldos";

    private DataLexikoniveldos dataLexikoniveldos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_lexiko);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        dataLexikoniveldos=new DataLexikoniveldos();
    }
    public void ejercicios(View view){

        Intent intent=new Intent(this,EjerciciosActivity.class);
        startActivity(intent);

    }

    public void segundonivellexiko(View view){
        Intent intent=new Intent(this, LexikoSegundonivelActivity.class);
        intent.putExtra(EXTRA_DATA_LEX_DOS,dataLexikoniveldos);
        startActivity(intent);
    }



}
