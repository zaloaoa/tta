package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestAbestiakniveltres;
import es.tta.guztiokeuskarapp.example.presentation.DataAbestiakniveltres;

public class AbestiakTercernivelActivity extends AppCompatActivity  {

    private DataAbestiakniveltres data;
    private String correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abestiak_tercernivel);
        Intent intent=getIntent();
        data=(DataAbestiakniveltres)intent.getSerializableExtra(NivelesAbestiakActivity.EXTRA_DATA_ABE_TRES);//data=dataAbestiakniveltres
        TestAbestiakniveltres test=data.getTest();
        TextView textWording = (TextView)findViewById(R.id.testabestiaktres_wording);
        textWording.setText(test.getWording());


        correct=test.getCorrect();

    }

    public void send(View view){
        EditText editText=(EditText)findViewById(R.id.correct);
        String edit=editText.getText().toString();

        if(correct.equals(edit)){
            Toast.makeText(getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();

        }
        else
            Toast.makeText(getApplicationContext(),"¡Has fallado!",Toast.LENGTH_SHORT).show();


    }

    public void next(View view){
        Intent intent=new Intent (this,AbestiakTercernivelActivity.class);
        intent.putExtra(NivelesAbestiakActivity.EXTRA_DATA_ABE_TRES, data);
        startActivity(intent);
    }

    public void nivelescanciones(View view){
        Intent intent=new Intent(this,NivelesAbestiakActivity.class);
        startActivity(intent);
    }

}
