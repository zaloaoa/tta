package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.CancionesActivity;
import es.tta.guztiokeuskarapp.example.CuentosActivity;
import es.tta.guztiokeuskarapp.example.EjerciciosActivity;
import es.tta.guztiokeuskarapp.example.LexikoActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
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
    }

    public void lexiko(View view){
        Intent intent=new Intent(this,LexikoActivity.class);
        startActivity(intent);
    }

    public void cuentos(View view){
        Intent intent=new Intent(this,CuentosActivity.class);
        startActivity(intent);

    }

    public void canciones(View view){

        Intent intent=new Intent(this,CancionesActivity.class);
        startActivity(intent);

    }
    public void ejercicios(View view){

        Intent intent=new Intent(this,EjerciciosActivity.class);
        startActivity(intent);

    }

}
