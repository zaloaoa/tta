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
import es.tta.guztiokeuskarapp.example.model.Testlexikoniveluno;
import es.tta.guztiokeuskarapp.example.presentation.DataLexikoniveluno;

public class LexikoPrimernivelActivity extends AppCompatActivity implements View.OnClickListener{
    private DataLexikoniveluno dataLexikoniveluno;
    private int correct;
    private int imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lexiko_primernivel);
        Intent intent = getIntent();
        dataLexikoniveluno = (DataLexikoniveluno) intent.getSerializableExtra(NivelesLexikoActivity.EXTRA_DATA_LEX_UNO);
        Testlexikoniveluno testlexikoniveluno=dataLexikoniveluno.getTest();

        TextView texWording=(TextView)findViewById(R.id.textchoicelexniveluno);
        texWording.setText(testlexikoniveluno.getWording());
        imagen=testlexikoniveluno.getImagen();
        ImageView imageView=(ImageView)findViewById(R.id.lexikoniveluno);
        imageView.setImageResource(imagen);

        RadioGroup group=(RadioGroup)findViewById(R.id.test_choices_lex_uno);
        int i=0;

        for(Testlexikoniveluno.Choice choice:testlexikoniveluno.getChoices()){

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
        findViewById(R.id.button_comprobar_lexiko_uno).setVisibility(View.VISIBLE);
    }

    public void send (View view){
    RadioGroup group = (RadioGroup) findViewById(R.id.test_choices_lex_uno);
    int selectedID = group.getCheckedRadioButtonId();
    View radioButton = group.findViewById(selectedID);
    int selected = group.indexOfChild(radioButton);//para coger en index
    int choices = group.getChildCount();
    for (int i=0; i < choices; i++){
        group.getChildAt(i).setEnabled(false);//no se puede clikar otra vez
    }
    View button = findViewById(R.id.button_comprobar_lexiko_uno);
    ((ViewGroup) button.getParent()).removeView(button);

    group.getChildAt(correct).setBackgroundColor(Color.GREEN);
    if(selected != correct){
        group.getChildAt(selected).setBackgroundColor(Color.RED);
        Toast.makeText(getApplicationContext(), "¡Has fallado!", Toast.LENGTH_SHORT).show();

    } else
            Toast.makeText(getApplicationContext(),"¡Correcto!",Toast.LENGTH_SHORT).show();
    }

    public void next_lexikoniveluno(View view){
        Intent intent=new Intent(this,LexikoPrimernivelActivity.class);
        intent.putExtra(NivelesLexikoActivity.EXTRA_DATA_LEX_UNO, dataLexikoniveluno);
        startActivity(intent);

    }

    public void niveleslexiko(View view){
        Intent intent=new Intent(this,NivelesLexikoActivity.class);
        startActivity(intent);
    }

}
