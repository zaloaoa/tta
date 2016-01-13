package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;

public class ContarTxanoActivity extends AppCompatActivity {

    int[] imagen = new int[6];
    int i = 0;

    public ContarTxanoActivity() {
        imagen[0] = R.drawable.ahateitsusia1;
        imagen[1] = R.drawable.ahateitsusia2;
        imagen[2] = R.drawable.ahateitsusia3;
        imagen[3] = R.drawable.ahateitsusia4;
        imagen[4] = R.drawable.ahateitsusia5;
        imagen[5] = R.drawable.ahateitsusia6;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_txano);

        ImageView imageView = (ImageView) findViewById(R.id.contartxanogorri);//buscamos la imagen

        imageView.setImageResource(imagen[i]);//metemos la imagen

        i++;//incrementamos para que la próxima vez, al dar a next, salga la próxima imagen


    }

    public void next(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.contartxanogorri);

        imageView.setImageResource(imagen[i]);
        i++;
        if (i == 5) {
            View button = findViewById(R.id.nexttxano);
            ((ViewGroup) button.getParent()).removeView(button);//cuando lleguemos a la última foto, quitamos el botón de next

        }

    }

    public void volvercontarcuentos(View view)
    {
        Intent intent=new Intent(this, MenuContarcuentosActivity.class);
        startActivity(intent);
    }
}
