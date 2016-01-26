package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import es.tta.guztiokeuskarapp.example.presentation.DataAbestiakniveluno;
import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestAbestiakniveluno;

public class AbestiakPrimernivelActivity extends AppCompatActivity implements View.OnClickListener {

    private int correct;
    private DataAbestiakniveluno data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abestiak_primernivel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent=getIntent();
        data = (DataAbestiakniveluno) intent.getSerializableExtra(NivelesAbestiakActivity.EXTRA_DATA_ABE_UNO);//data=dataabestiakniveluno
        TestAbestiakniveluno test=data.getTest();//cogemos el test, uno cada vez
        TextView textWording = (TextView)findViewById(R.id.testabestiakuno_wording);
        textWording.setText(test.getWording());//se pone el enunciado
        RadioGroup group=(RadioGroup)findViewById(R.id.test_choices_abe_uno);
        int i = 0;
        for(TestAbestiakniveluno.Choice choice:test.getChoices()){

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
        RadioGroup group = (RadioGroup) findViewById(R.id.test_choices_abe_uno);
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
        Intent intent=new Intent (this,AbestiakPrimernivelActivity.class);
        intent.putExtra(NivelesAbestiakActivity.EXTRA_DATA_ABE_UNO, data);
        startActivity(intent);
    }

    public void nivelescanciones(View view){
        Intent intent=new Intent(this,NivelesAbestiakActivity.class);
        startActivity(intent);
    }

}
