package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.EjerciciosActivity;
import es.tta.guztiokeuskarapp.example.presentation.DataIpuinakniveldos;
import es.tta.guztiokeuskarapp.example.presentation.DataIpuinakniveluno;

public class NivelesIpuinakActivity extends AppCompatActivity {

    public final static String EXTRA_DATA_IP_DOS ="es.tta.guztiokeuskarapp.dataipuinakniveldos";
    public final static String EXTRA_DATA_IP_UNO ="es.tta.guztiokeuskarapp.dataipuinakniveluno";

    private DataIpuinakniveluno dataIpuinakniveluno;
    private DataIpuinakniveldos dataIpuinakniveldos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_ipuinak);
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

        dataIpuinakniveldos=new DataIpuinakniveldos();
        dataIpuinakniveluno=new DataIpuinakniveluno();
    }
    public void ejercicios(View view){

        Intent intent=new Intent(this,EjerciciosActivity.class);
        startActivity(intent);

    }

    public void segundonivelcuentos(View view){
        Intent intent=new Intent(this,IpuinakSegundonivelActivity.class);
        intent.putExtra(EXTRA_DATA_IP_DOS,dataIpuinakniveldos);
        startActivity(intent);

    }

    public void primernivelcuentos(View view){
        Intent intent=new Intent(this,IpuinakNivelunoActivity.class);
        intent.putExtra(EXTRA_DATA_IP_UNO,dataIpuinakniveluno);
        startActivity(intent);
    }


}
