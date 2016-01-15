package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;

public class MenuVerCuentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ver_cuentos);
    }

    public void volvercuentos(View view){
        Intent intent=new Intent(this,CuentosActivity.class);
        startActivity(intent);
    }


    public void vertxano(View view){
        Intent intent=new Intent(this,VerTxanoActivity.class);
        startActivity(intent);
    }

    /*public void verahate (View view)
    {
        Intent intent=new Intent(this, ContarAhateActivity.class);
        startActivity(intent);
    }

    public void vertxerri(View view){
        Intent intent=new Intent(this, ContarHiruTxerriActivity.class);
        startActivity(intent);
    }*/

}


