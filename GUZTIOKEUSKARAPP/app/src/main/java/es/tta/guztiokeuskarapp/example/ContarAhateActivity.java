package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestContarAhate;
import es.tta.guztiokeuskarapp.example.presentation.DataContarAhate;

public class ContarAhateActivity extends AppCompatActivity {
    private DataContarAhate dataContarAhate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_ahate);

        Intent intent=getIntent();
        dataContarAhate=(DataContarAhate)intent.getSerializableExtra(MenuContarcuentosActivity.EXTRA_DATA_CONTAR_AHATE);
        TestContarAhate test=dataContarAhate.getTest();
        int i=test.getImagen();


        ImageView imageView=(ImageView)findViewById(R.id.contarahateitsusia);

        imageView.setImageResource(i);




    }

    public void next(View view)
    {
        Intent intent=new Intent(this, ContarAhateActivity.class);
        intent.putExtra(MenuContarcuentosActivity.EXTRA_DATA_CONTAR_AHATE,dataContarAhate);
        startActivity(intent);
    }
    public void volvercontarcuentos(View view)
    {
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }



}
