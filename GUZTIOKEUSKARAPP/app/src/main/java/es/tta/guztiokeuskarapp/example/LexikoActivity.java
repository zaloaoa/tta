package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.Traduccion;
import es.tta.guztiokeuskarapp.example.prof.views.ProgressTask;

public class LexikoActivity extends ModelActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lexiko);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public void buttonagurrak(View View){
        new ProgressTask<Traduccion>(this){


            @Override
            protected Traduccion work() throws Exception {

                String a="requestTraduccion.json";
                Log.e("guztiok", "entra en lexikoactivity en work");
                return server.getTraduccion(a);
            }

            @Override
            protected void onFinish(Traduccion result) {

                data.putTraduccion(result);
                Log.e("guztiok", "entra en lexikoactivity en onfinish");
                startModelActivity(AgurrakActivity.class);//La actividad de Agurrak

            }
        }.execute();

    }

}
