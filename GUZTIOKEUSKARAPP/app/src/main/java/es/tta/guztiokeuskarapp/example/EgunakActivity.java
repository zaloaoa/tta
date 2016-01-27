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
import es.tta.guztiokeuskarapp.example.model.Egunak;


public class EgunakActivity extends ModelActivity {
    private Egunak egunak;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egunak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        egunak=data.getEgunak();
        for(Egunak.Eguna eg:egunak.getEgunak()){
            layout=(LinearLayout)findViewById(R.id.egu);
            TextView textView=new TextView(this);
            String a=eg.getPalabraCastellano();
            String b=eg.getTablaTraduccioncol();
            textView.setText(a+":"+b);
            layout.addView(textView);
        }


    }

    public void volverlexiko(View view){
        Intent intent=new Intent(this,LexikoActivity.class);
        startActivity(intent);
    }

}
