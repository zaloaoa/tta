package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;

public class LexikoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lexiko);
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

    public void menuprincipal(View view){
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);

    }

    public void buttoneskola(View view){
        Intent intent=new Intent(this,EskolaActivity.class);
        startActivity(intent);
    }

    public void buttonetxeko(View view){
        Intent intent=new Intent(this,EtxekoActivity.class);
        startActivity(intent);


    }

    public void buttonadjektiboak(View view){
        Intent intent=new Intent(this,AdjektiboakActivity.class);
        startActivity(intent);

    }

    public void buttonegunak(View view){
        Intent intent=new Intent(this,EgunakActivity.class);
        startActivity(intent);
    }

    public void buttonzenbakiak(View view){
        Intent intent=new Intent(this,ZenbakiakActivity.class);
        startActivity(intent);
    }

    public void buttonkoloreak (View view){
        Intent intent=new Intent(this,KoloreakActivity.class);
        startActivity(intent);
    }

    public void buttonfamilia(View view){
        Intent intent=new Intent(this,FamiliaActivity.class);
        startActivity(intent);
    }

}
