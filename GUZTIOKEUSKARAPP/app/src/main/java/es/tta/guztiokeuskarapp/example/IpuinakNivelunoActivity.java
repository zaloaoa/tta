package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestIpuinakniveluno;
import es.tta.guztiokeuskarapp.example.presentation.DataIpuinakniveluno;

public class IpuinakNivelunoActivity extends AppCompatActivity implements View.OnClickListener{
    private DataIpuinakniveluno data;
    private int correct;
    private int imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipuinak_niveluno);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent=getIntent();
        data=(DataIpuinakniveluno)intent.getSerializableExtra(NivelesIpuinakActivity.EXTRA_DATA_IP_UNO);
        TestIpuinakniveluno test=data.getTest();

        TextView texWording=(TextView)findViewById(R.id.textchoiceipniveluno);
        texWording.setText(test.getWording());
        imagen=test.getImagen();
        ImageView imageView=(ImageView)findViewById(R.id.ipuinakniveluno);
        imageView.setImageResource(imagen);

        RadioGroup group=(RadioGroup)findViewById(R.id.test_choices_ipu_uno);
        int i=0;

        for(TestIpuinakniveluno.Choice choice:test.getChoices()){

            RadioButton radio = new RadioButton(this);
            radio.setText(choice.getWording());
            radio.setOnClickListener(this);
            group.addView(radio);
            if(choice.isCorrect()){
                correct = i;
            }
            i++;

        }


    }

    @Override
    public void onClick(View u){
        findViewById(R.id.button_comprobar).setVisibility(View.VISIBLE);
    }

    public void send (View view){
        RadioGroup group = (RadioGroup) findViewById(R.id.test_choices_ipu_uno);
        int selectedID = group.getCheckedRadioButtonId();
        View radioButton = group.findViewById(selectedID);
        int selected = group.indexOfChild(radioButton);//para coger en index
        int choices = group.getChildCount();
        for (int i=0; i < choices; i++){
            group.getChildAt(i).setEnabled(false);//no se puede clikar otra vez
        }
        View button = findViewById(R.id.button_comprobar);
        ((ViewGroup) button.getParent()).removeView(button);

        group.getChildAt(correct).setBackgroundColor(Color.GREEN);
        if(selected != correct){
            group.getChildAt(selected).setBackgroundColor(Color.RED);
            Toast.makeText(getApplicationContext(), "¡Has fallado!", Toast.LENGTH_SHORT).show();

        } else
            Toast.makeText(getApplicationContext(),"¡Correcto!",Toast.LENGTH_SHORT).show();
    }

    public void next(View view){
        Intent intent=new Intent (this,IpuinakNivelunoActivity.class);
        intent.putExtra(NivelesIpuinakActivity.EXTRA_DATA_IP_UNO, data);
        startActivity(intent);
    }
    public void nivelescuentos(View view){
        Intent intent=new Intent(this,NivelesIpuinakActivity.class);
        startActivity(intent);
    }

}
