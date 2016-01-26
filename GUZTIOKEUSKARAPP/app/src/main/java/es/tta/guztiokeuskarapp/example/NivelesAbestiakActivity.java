package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.AbestiakPrimernivelActivity;
import es.tta.guztiokeuskarapp.example.EjerciciosActivity;
import es.tta.guztiokeuskarapp.example.presentation.DataAbestiakniveldos;
import es.tta.guztiokeuskarapp.example.presentation.DataAbestiakniveltres;
import es.tta.guztiokeuskarapp.example.presentation.DataAbestiakniveluno;

public class NivelesAbestiakActivity extends AppCompatActivity {

    public final static String EXTRA_DATA_ABE_UNO ="es.tta.guztiokeuskarapp.dataabestiakniveluno";
    public final static String EXTRA_DATA_ABE_DOS ="es.tta.guztiokeuskarapp.dataabestiakniveldos";
    public final static String EXTRA_DATA_ABE_TRES ="es.tta.guztiokeuskarapp.dataabestiakniveltres";

    private DataAbestiakniveluno dataAbestiakniveluno;
    private DataAbestiakniveldos dataAbestiakniveldos;
    private DataAbestiakniveltres dataAbestiakniveltres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_abestiak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        dataAbestiakniveluno=new DataAbestiakniveluno();
        dataAbestiakniveldos=new DataAbestiakniveldos();
        dataAbestiakniveltres=new DataAbestiakniveltres();
    }

    public void ejercicios(View view){

        Intent intent=new Intent(this,EjerciciosActivity.class);
        startActivity(intent);

    }

    public void primernivelcanciones(View view){

        Intent intent=new Intent(this,AbestiakPrimernivelActivity.class);
        intent.putExtra(EXTRA_DATA_ABE_UNO,dataAbestiakniveluno);
        startActivity(intent);


    }

    public void segundonivelcanciones(View view){
        Intent intent =new Intent(this,AbestiakSegundonivelActivity.class);
        intent.putExtra(EXTRA_DATA_ABE_DOS,dataAbestiakniveldos);
        startActivity(intent);
    }

    public void tercernivelcanciones(View view){
        Intent intent=new Intent(this,AbestiakTercernivelActivity.class);
        intent.putExtra(EXTRA_DATA_ABE_TRES,dataAbestiakniveltres);
        startActivity(intent);
    }



}
