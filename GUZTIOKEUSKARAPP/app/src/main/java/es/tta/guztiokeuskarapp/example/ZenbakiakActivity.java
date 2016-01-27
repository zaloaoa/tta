package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.Zenbakia;

public class ZenbakiakActivity extends ModelActivity {
    private Zenbakia zenbakia;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zenbakiak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        zenbakia=data.getZenbakia();
        for(Zenbakia.Zenbakiak ze:zenbakia.getZenbakiak()){
            layout=(LinearLayout)findViewById(R.id.zenb);
            TextView textView=new TextView(this);
            String a=ze.getPalabraCastellano();
            String b=ze.getTablaTraduccioncol();
            textView.setText(a+":"+b);
            layout.addView(textView);
        }

    }

    public void volverlexiko(View view){
        Intent intent=new Intent(this,LexikoActivity.class);
        startActivity(intent);
    }

}
