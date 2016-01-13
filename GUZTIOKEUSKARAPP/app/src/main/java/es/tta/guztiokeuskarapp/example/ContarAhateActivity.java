package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;

public class ContarAhateActivity extends AppCompatActivity {

    int[] imagen=new int[7];
    int i=0;
    public ContarAhateActivity(){

        imagen[0]=R.drawable.ahateitsusia1;
        imagen[1]=R.drawable.ahateitsusia2;
        imagen[2]=R.drawable.ahateitsusia3;
        imagen[3]=R.drawable.ahateitsusia4;
        imagen[4]=R.drawable.ahateitsusia5;
        imagen[5]=R.drawable.ahateitsusia6;
        imagen[6]=R.drawable.ahateitsusia8;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_ahate);




        ImageView imageView=(ImageView)findViewById(R.id.contarahateitsusia);

        imageView.setImageResource(imagen[i]);

        i++;




    }

    public void next(View view)
    {
        ImageView imageView=(ImageView)findViewById(R.id.contarahateitsusia);

        imageView.setImageResource(imagen[i]);
        i++;
        if(i==6){
            View button=findViewById(R.id.nextahate);
            ((ViewGroup) button.getParent()).removeView(button);


        }
    }
    public void volvercontarcuentos(View view)
    {
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }



}
