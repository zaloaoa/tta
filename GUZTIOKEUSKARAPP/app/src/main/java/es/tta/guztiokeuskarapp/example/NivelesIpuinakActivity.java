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
import es.tta.guztiokeuskarapp.example.presentation.DataIpuinakniveltres;
import es.tta.guztiokeuskarapp.example.presentation.DataIpuinakniveluno;

public class NivelesIpuinakActivity extends AppCompatActivity {

    public final static String EXTRA_DATA_IP_DOS ="es.tta.guztiokeuskarapp.dataipuinakniveldos";
    public final static String EXTRA_DATA_IP_UNO ="es.tta.guztiokeuskarapp.dataipuinakniveluno";
    public final static String EXTRA_DATA_IP_TRES ="es.tta.guztiokeuskarapp.dataipuinakniveltres";


    private DataIpuinakniveluno dataIpuinakniveluno;
    private DataIpuinakniveldos dataIpuinakniveldos;
    private DataIpuinakniveltres dataIpuinakniveltres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_ipuinak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        dataIpuinakniveldos=new DataIpuinakniveldos();
        dataIpuinakniveluno=new DataIpuinakniveluno();
        dataIpuinakniveltres=new DataIpuinakniveltres();
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

    public void tercernivelcuentos(View view){
        Intent intent=new Intent(this,IpuinakTercernivelActivity.class);
        intent.putExtra(EXTRA_DATA_IP_TRES,dataIpuinakniveltres);
        startActivity(intent);
    }


}
