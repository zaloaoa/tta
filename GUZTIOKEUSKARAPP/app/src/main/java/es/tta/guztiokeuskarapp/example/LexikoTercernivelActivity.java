package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestLexikoniveltres;
import es.tta.guztiokeuskarapp.example.presentation.DataLexikoniveltres;
import es.tta.guztiokeuskarapp.example.prof.views.AudioPlayer;

public class LexikoTercernivelActivity extends AppCompatActivity {
    private DataLexikoniveltres dataLexikoniveltres;
    private String audioo;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lexiko_tercernivel);

        Intent intent = getIntent();
        dataLexikoniveltres = (DataLexikoniveltres) intent.getSerializableExtra(NivelesLexikoActivity.EXTRA_DATA_LEX_TRES);
        TestLexikoniveltres testLexikoniveltres = dataLexikoniveltres.getTestLexikoniveltres();
        TextView textWording = (TextView) findViewById(R.id.testlexikoniveltres);
        textWording.setText(testLexikoniveltres.getWording());
        audioo = testLexikoniveltres.getAudio();
        layout = (LinearLayout) findViewById(R.id.testlextres);
        Toast.makeText(getApplicationContext(), audioo, Toast.LENGTH_SHORT).show();


    }

    public void escucharlexikoniveltres(View view) throws IOException {
        view.setEnabled(false);
        showAudio(audioo);

    }

    public void next(View view){
        Intent intent=new Intent(this,LexikoTercernivelActivity.class);
        intent.putExtra(NivelesLexikoActivity.EXTRA_DATA_LEX_TRES,dataLexikoniveltres);
        startActivity(intent);

    }

    private void showAudio(String audioo) throws IOException {
        View view = new View(this);
        AudioPlayer audio = new AudioPlayer(view);
        audio.setAudioUri(Uri.parse(audioo));
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(params);
        layout.addView(view);
        audio.start();
    }

    public void niveleslexiko(View view){
        Intent intent=new Intent(this,NivelesLexikoActivity.class);
        startActivity(intent);
    }

}