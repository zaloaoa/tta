package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;

public class ContarTxanoActivity extends AppCompatActivity {

    int[]imagentxano=new int[6];
    int i=0;
    public ContarTxanoActivity(){
        imagentxano[0]=R.drawable.ahateitsusia1;
        imagentxano[1]=R.drawable.ahateitsusia2;
        imagentxano[2]=R.drawable.ahateitsusia3;
        imagentxano[3]=R.drawable.ahateitsusia3;
        imagentxano[4]=R.drawable.ahateitsusia4;
        imagentxano[5]=R.drawable.ahateitsusia5;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_txano);


        
       ImageView imageView=(ImageView)findViewById(R.id.contartxanogorri);

        imageView.setImageResource(imagentxano[i]);
        i++;



    }

    public void next(View view){
        ImageView imageView=(ImageView)findViewById(R.id.contartxanogorri);
        imageView.setImageResource(imagentxano[i]);
        i++;
        if(i==5)
        {
            View button=findViewById(R.id.nexttxano);
            ( (ViewGroup) button.getParent()).removeView(button);


        }


    }
    public void volvercontarcuentos(View view)
    {
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }

}
