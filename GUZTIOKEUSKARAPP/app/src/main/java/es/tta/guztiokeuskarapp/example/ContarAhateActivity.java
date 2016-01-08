package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;

public class ContarAhateActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_ahate);




        ImageView imageView=(ImageView)findViewById(R.id.contarahateitsusia);






    }

    public void next(View view)
    {


    }
    public void volvercontarcuentos(View view)
    {
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }



}
