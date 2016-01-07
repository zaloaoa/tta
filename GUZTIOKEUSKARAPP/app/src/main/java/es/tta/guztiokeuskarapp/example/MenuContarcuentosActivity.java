package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.presentation.DataContarAhate;
import es.tta.guztiokeuskarapp.example.presentation.DataContarTxano;

public class MenuContarcuentosActivity extends AppCompatActivity {

    public final static String EXTRA_DATA_CONTAR_TXANO ="es.tta.guztiokeuskarapp.datacontartxano";
    public final static String EXTRA_DATA_CONTAR_AHATE="es.tta.guztiokeuskarapp.datacontarahate";

    private DataContarTxano dataContarTxano;
    private DataContarAhate dataContarAhate;

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

        dataContarTxano=new DataContarTxano();
        dataContarAhate=new DataContarAhate();

    }
    public void volvercuentos(View view){
        Intent intent=new Intent(this,CuentosActivity.class);
        startActivity(intent);
    }

    public void contartxano(View view){
        Intent intent=new Intent(this,ContarTxanoActivity.class);
        intent.putExtra(EXTRA_DATA_CONTAR_TXANO,dataContarTxano);
        startActivity(intent);
    }

    public void contarahate (View view)
    {
        Intent intent=new Intent(this, ContarAhateActivity.class);
        intent.putExtra(EXTRA_DATA_CONTAR_AHATE,dataContarAhate);
        startActivity(intent);
    }


}
