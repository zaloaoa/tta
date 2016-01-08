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

public class ContarZazpiActivity extends AppCompatActivity {

    int[]imagenzazpi=new int[6];
    int i=0;
    public ContarZazpiActivity(){
        imagenzazpi[0]=R.drawable.ahateitsusia1;
        imagenzazpi[1]=R.drawable.ahateitsusia2;
        imagenzazpi[2]=R.drawable.ahateitsusia3;
        imagenzazpi[3]=R.drawable.ahateitsusia3;
        imagenzazpi[4]=R.drawable.ahateitsusia4;
        imagenzazpi[5]=R.drawable.ahateitsusia5;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_zazpi);

        ImageView imageView = (ImageView) findViewById(R.id.contarzazpi);
        imageView.setImageResource(imagenzazpi[i]);
        i++;

    }


    public void next(View view)
    {
        ImageView imageView=(ImageView)findViewById(R.id.contarzazpi);
        imageView.setImageResource(imagenzazpi[i]);
        i++;
        if(i==5) {
            View button = findViewById(R.id.nextzazpi);
            ((ViewGroup) button.getParent()).removeView(button);

        }

        }
    public void volvercontarcuentos(View view)
    {
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }


}
