package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;

public class ContarTxanoActivity extends AppCompatActivity {

    int[] imagen=new int[9];
    int i=0;

    public ContarTxanoActivity(){
        imagen[0]=R.drawable.txanogorritxo1;
        imagen[1]=R.drawable.txanogorritxo2;
        imagen[2]=R.drawable.txanogorritxo3;
        imagen[3]=R.drawable.txanogorritxo4;
        imagen[4]=R.drawable.txanogorritxo5;
        imagen[5]=R.drawable.txanogorritxo7;
        imagen[6]=R.drawable.txanogorritxo8;
        imagen[7]=R.drawable.txanogorritxo9;
        imagen[8]=R.drawable.txanogorritxo10;




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_txano);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageView imageView=(ImageView)findViewById(R.id.contartxanogorri);

        imageView.setImageResource(imagen[i]);

        i++;


    }

    public void nextxano(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.contartxanogorri);
        imageView.setImageResource(imagen[i]);
        i++;
        if (i ==9) {
            View button = findViewById(R.id.nextxano);
            ((ViewGroup) button.getParent()).removeView(button);


        }


    }

    public void volvercontarcuentos(View view){
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }

}
