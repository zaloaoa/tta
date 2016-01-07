package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestContarTxano;
import es.tta.guztiokeuskarapp.example.presentation.DataContarTxano;

public class ContarTxanoActivity extends AppCompatActivity {

    private DataContarTxano data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_txano);


        Intent intent=getIntent();
        data=(DataContarTxano)intent.getSerializableExtra(MenuContarcuentosActivity.EXTRA_DATA_CONTAR_TXANO);
        TestContarTxano test=data.getTest();
       int imagen=test.getImagen();
        
       ImageView imageView=(ImageView)findViewById(R.id.contartxanogorri);

        imageView.setImageResource(imagen);


    }

    public void next(View view){
        Intent intent=new Intent(this,ContarTxanoActivity.class);
        intent.putExtra(MenuContarcuentosActivity.EXTRA_DATA_CONTAR_TXANO,data);
        startActivity(intent);
    }

}
