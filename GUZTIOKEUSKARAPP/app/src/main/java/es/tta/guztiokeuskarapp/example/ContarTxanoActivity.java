package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import es.tta.guztiokeuskarapp.R;

public class ContarTxanoActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_txano);


        Intent intent=getIntent();

        
       ImageView imageView=(ImageView)findViewById(R.id.contartxanogorri);




    }

    public void next(View view){
        Intent intent=new Intent(this,ContarTxanoActivity.class);

        startActivity(intent);
    }

}
