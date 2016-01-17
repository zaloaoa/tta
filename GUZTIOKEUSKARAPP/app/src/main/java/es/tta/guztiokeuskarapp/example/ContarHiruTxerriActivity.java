package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;

public class ContarHiruTxerriActivity extends AppCompatActivity {
    int[] imagen=new int[8];
    int i=0;

    public ContarHiruTxerriActivity(){
        imagen[0]=R.drawable.hirutxerrikumeak1;
        imagen[1]=R.drawable.hirutxerrikumeak2;
        imagen[2]=R.drawable.hirutxerrikumeak3;
        imagen[3]=R.drawable.hirutxerrikumeak4;
        imagen[4]=R.drawable.hirutxerrikumeak5;
        imagen[5]=R.drawable.hirutxerrikumeak6;
        imagen[6]=R.drawable.hirutxerrikumeak7;
        imagen[7]=R.drawable.hirutxerrikumeak11;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_hiru_txerri);

        ImageView imageView=(ImageView)findViewById(R.id.contarhirutxerri);

        imageView.setImageResource(imagen[i]);

        i++;


    }

    public void next(View view)
    {
        ImageView imageView=(ImageView)findViewById(R.id.contarhirutxerri);

        imageView.setImageResource(imagen[i]);
        i++;
        if(i==8){
            View button=findViewById(R.id.nexttxerri);
            ((ViewGroup) button.getParent()).removeView(button);


        }
    }

    public void volvercontarcuentos(View view){
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }

}
