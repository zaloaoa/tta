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
import es.tta.guztiokeuskarapp.example.model.Ajetivo;
import es.tta.guztiokeuskarapp.example.model.Familia;
import es.tta.guztiokeuskarapp.example.model.Itzulpen;
import es.tta.guztiokeuskarapp.example.model.Objeto;
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
        new ProgressTask<Itzulpen>(this){


            @Override
            protected Itzulpen work() throws Exception {

                String a="requestEskola.json";
                Log.e("guztiok", "entra en lexikoactivity en work");
                return server.getItzulpen(a);
            }

            @Override
            protected void onFinish(Itzulpen result) {

                data.putItzulpen(result);
                Log.e("guztiok", "entra en lexikoactivity en eskola en onfinish");
                startModelActivity(EskolaActivity.class);//La actividad de Eskola

            }
        }.execute();
    }

    public void buttonetxeko(View view){
        new ProgressTask<Objeto>(this){


            @Override
            protected Objeto work() throws Exception {

                String a="requestEtxeko.json";
                return server.getObjeto(a);
            }

            @Override
            protected void onFinish(Objeto result) {

                data.putObjeto(result);
                startModelActivity(EtxekoActivity.class);

            }
        }.execute();

    }

    public void buttonadjektiboak(View view){
        new ProgressTask<Ajetivo>(this){


            @Override
            protected Ajetivo work() throws Exception {

                String a="requestAdjetivo.json";
                return server.getAjetivo(a);
            }

            @Override
            protected void onFinish(Ajetivo result) {

                data.putAjetivo(result);
                startModelActivity(AdjektiboakActivity.class);

            }
        }.execute();

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
        new ProgressTask<Familia>(this){


            @Override
            protected Familia work() throws Exception {

                String a="requestFamilia.json";
                return server.getFamilia(a);
            }

            @Override
            protected void onFinish(Familia result) {

                data.putFamilia(result);
                startModelActivity(FamiliaActivity.class);

            }
        }.execute();
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
