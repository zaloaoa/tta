package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;

public class MenuContarcuentosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_contarcuentos);


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
    public void volvercuentos(View view){
        Intent intent=new Intent(this,CuentosActivity.class);
        startActivity(intent);
    }

    public void contartxano(View view){
        Intent intent=new Intent(this,ContarTxanoActivity.class);
        startActivity(intent);
    }

    public void contarahate (View view)
    {

    }
    public void contarzazpi(View view){
        Intent intent=new Intent(this,ContarZazpiActivity.class);
        startActivity(intent);
    }


}
