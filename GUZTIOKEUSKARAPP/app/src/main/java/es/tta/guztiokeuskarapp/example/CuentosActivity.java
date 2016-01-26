package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;

public class CuentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuentos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void menuprincipal(View view){
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);

    }

    public void contarcuentos (View view){
        Intent intent=new Intent(this,MenuContarcuentosActivity.class);
        startActivity(intent);
    }

    public void vercuentos (View view)
    {
        Intent intent=new Intent(this,MenuVerCuentosActivity.class);
        startActivity(intent);
    }

}
