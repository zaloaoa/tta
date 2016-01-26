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
import es.tta.guztiokeuskarapp.example.model.TestIpuinakniveldos;
import es.tta.guztiokeuskarapp.example.presentation.DataIpuinakniveldos;
import es.tta.guztiokeuskarapp.example.prof.views.AudioPlayer;

public class IpuinakSegundonivelActivity extends AppCompatActivity  {
    private DataIpuinakniveldos data;
    private String audioo;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipuinak_segundonivel);

        Intent intent=getIntent();
        data=(DataIpuinakniveldos)intent.getSerializableExtra(NivelesIpuinakActivity.EXTRA_DATA_IP_DOS);
        TestIpuinakniveldos testIpuinakniveldos=data.getTest();
        TextView textWording=(TextView)findViewById(R.id.testipuinakniveldos);
        textWording.setText(testIpuinakniveldos.getWording());
        audioo=testIpuinakniveldos.getAudio();
        layout = (LinearLayout) findViewById(R.id.testipuinakdos);//lo pone abajo
       // Toast.makeText(getApplicationContext(),audioo, Toast.LENGTH_SHORT).show();

    }

    public void escucharipuinakniveldos(View view) throws IOException {
        view.setEnabled(false);
        showAudio(audioo);

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

    public void next(View view){
        Intent intent=new Intent(this,IpuinakSegundonivelActivity.class);
        intent.putExtra(NivelesIpuinakActivity.EXTRA_DATA_IP_DOS,data);
        startActivity(intent);
    }


    public void nivelescuentos(View view){
        Intent intent=new Intent(this,NivelesIpuinakActivity.class);
        startActivity(intent);
    }



}
