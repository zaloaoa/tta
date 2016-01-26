package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.Business;
import es.tta.guztiokeuskarapp.example.presentation.Data;
import es.tta.guztiokeuskarapp.example.prof.comms.RestClient;

public abstract class ModelActivity extends AppCompatActivity {
    public static final String URL="http://u017633.ehu.eus:18080/Guztiok/carpeta";
    protected RestClient rest;
    protected Business server;
    protected Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);
        data = new Data(getIntent().getExtras());
        rest= new RestClient(URL);
        server= new Business(rest);


    }

    protected <T> void startModelActivity(Class<T> cls){
        Intent intent= newIntent(cls);
        startActivity(intent);
    }


    protected <T> Intent newIntent(Class<T> cls){

        Intent intent= new Intent(getApplicationContext(),cls);
        intent.putExtras(data.getBundle());
        return intent;
    }

}
