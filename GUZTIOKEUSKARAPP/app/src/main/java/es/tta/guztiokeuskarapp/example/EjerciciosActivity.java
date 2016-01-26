package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;

public class EjerciciosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void menuprincipal(View view){
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);

    }

    public void niveleslexiko (View view)
    {
        Intent intent = new Intent (this,NivelesLexikoActivity.class);
        startActivity(intent);
    }

    public void nivelesipuinak (View view)
    {
        Intent intent = new Intent (this,NivelesIpuinakActivity.class);
        startActivity(intent);
    }

    public void nivelesabestiak(View view){
        Intent intent=new Intent(this,NivelesAbestiakActivity.class);
        startActivity(intent);
    }


}
