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

import java.io.IOException;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestIpuinakniveltres;
import es.tta.guztiokeuskarapp.example.presentation.DataIpuinakniveltres;
import es.tta.guztiokeuskarapp.example.prof.views.AudioPlayer;

public class IpuinakTercernivelActivity extends AppCompatActivity {
    private DataIpuinakniveltres data;
    private String audioo;
    private LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipuinak_tercernivel);

        Intent intent=getIntent();
        data=(DataIpuinakniveltres)intent.getSerializableExtra(NivelesIpuinakActivity.EXTRA_DATA_IP_TRES);
        TestIpuinakniveltres testIpuinakniveltres=data.getTest();
        TextView textWording=(TextView)findViewById(R.id.testipuinakniveltres);
        textWording.setText(testIpuinakniveltres.getWording());
        audioo=testIpuinakniveltres.getAudio();
        layout=(LinearLayout)findViewById(R.id.testipuinaktres);



    }
    public void escucharipuinakniveltres(View view) throws IOException {
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
        Intent intent=new Intent(this,IpuinakTercernivelActivity.class);
        intent.putExtra(NivelesIpuinakActivity.EXTRA_DATA_IP_TRES, data);
        startActivity(intent);
    }
    public void nivelescuentos(View view){
        Intent intent=new Intent(this,NivelesIpuinakActivity.class);
        startActivity(intent);
    }

}
