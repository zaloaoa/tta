package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.VerRiki;

public class CancionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canciones);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void menuprincipal(View view){
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);

    }

    public void contarcuentos(View view){
        Intent intent=new Intent(this,MenuContarcuentosActivity.class);
        startActivity(intent);

    }
    public void verpintto(View view)
    {
        Intent intent=new Intent(this,VerPinttoActivity.class);
        startActivity(intent);
    }

    public void verxalala(View view)
    {
        Intent intent=new Intent(this, VerRikiActivity.class);
        startActivity(intent);
    }

    public void verparis(View view)
    {
        Intent intent=new Intent(this,VerParistikActivity.class);
        startActivity(intent);
    }
    public void verikusi(View view)
    {
        Intent intent=new Intent(this,VerIkusiActivity.class);
        startActivity(intent);
    }


}
