package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.Traduccion;

public class AgurrakActivity extends ModelActivity {
    private Traduccion traduccion;
    private LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("guztiok", "entra en AgurrakActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agurrak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        traduccion=data.getTraduccion();
        Log.e("guztiok","la lista es:"+traduccion.getAgurra(0).getPalabraCastellano().toString());///añadido lo ultimo
        Log.e("guztiok", "la lista es:" + traduccion.getAgurra(11).getPalabraCastellano().toString());
        Log.e("guztiok","entra en agurrak");
        for(Traduccion.Agurrak agur : traduccion.getAgurrak()){
        layout=(LinearLayout)findViewById(R.id.saludos);
            TextView textView=new TextView(this);
            String a=agur.getPalabraCastellano();
            String b=agur.getTablaTraduccioncol();
           // textView.setWidth();
           // textView.setHeight();
            textView.setText(a+":"+b);
            layout.addView(textView);
            Log.e("guztiok", "a:" + a);
            Log.e("guztiok","b:"+b);


        }

    }
    public void volverlexiko(View view){
        Intent intent=new Intent(this,LexikoActivity.class);
        startActivity(intent);
    }

}
