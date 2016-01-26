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
import es.tta.guztiokeuskarapp.example.presentation.DataLexikoniveltres;
import es.tta.guztiokeuskarapp.example.presentation.DataLexikoniveluno;

public class NivelesLexikoActivity extends AppCompatActivity {

    public final static String EXTRA_DATA_LEX_UNO ="es.tta.guztiokeuskarapp.datalexikoniveluno";
    public final static String EXTRA_DATA_LEX_DOS ="es.tta.guztiokeuskarapp.datalexikoniveldos";
    public final static String EXTRA_DATA_LEX_TRES ="es.tta.guztiokeuskarapp.datalexikoniveltres";

    private DataLexikoniveldos dataLexikoniveldos;
    private DataLexikoniveluno dataLexikoniveluno;
    private DataLexikoniveltres dataLexikoniveltres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_lexiko);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        dataLexikoniveldos=new DataLexikoniveldos();
        dataLexikoniveluno=new DataLexikoniveluno();
        dataLexikoniveltres=new DataLexikoniveltres();
    }
    public void ejercicios(View view){

        Intent intent=new Intent(this,EjerciciosActivity.class);
        startActivity(intent);

    }


    public void primernivellexiko(View view){
        Intent intent=new Intent(this,LexikoPrimernivelActivity.class);
        intent.putExtra(EXTRA_DATA_LEX_UNO,dataLexikoniveluno);
        startActivity(intent);
    }
    public void segundonivellexiko(View view){
        Intent intent=new Intent(this, LexikoSegundonivelActivity.class);
        intent.putExtra(EXTRA_DATA_LEX_DOS,dataLexikoniveldos);
        startActivity(intent);
    }

    public void tercernivellexiko(View view){
        Intent intent=new Intent(this,LexikoTercernivelActivity.class);
        intent.putExtra(EXTRA_DATA_LEX_TRES,dataLexikoniveltres);
        startActivity(intent);

    }



}
