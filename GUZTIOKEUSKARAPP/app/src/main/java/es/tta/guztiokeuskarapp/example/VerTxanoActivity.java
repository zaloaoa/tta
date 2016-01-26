package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.IOException;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.VerCuentoTxanogorritxo;
import es.tta.guztiokeuskarapp.example.presentation.DataVerCuentoTxanogorritxo;

public class VerTxanoActivity extends AppCompatActivity  {

    private DataVerCuentoTxanogorritxo vertxano;
    private String enunciado;
    private String bideo;
    private LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_txano);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        vertxano=new DataVerCuentoTxanogorritxo();
        VerCuentoTxanogorritxo cuentotxano=vertxano.getCuentoTxanogorritxo();//consigo el cuento
        TextView textWording=(TextView)findViewById(R.id.ikusitxano);
        textWording.setText(cuentotxano.getWording());
        enunciado=cuentotxano.getWording();
        bideo=cuentotxano.getVideo();
        layout = (LinearLayout) findViewById(R.id.vercaperucita);

    }

    public void vercuentotxano(View view) throws IOException {
        view.setEnabled(false);
        showVideo();

    }


    private void showVideo(){
        VideoView video = new VideoView(this);
        video.setVideoURI(Uri.parse(bideo));
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        video.setLayoutParams(params);

        android.widget.MediaController controller = new android.widget.MediaController(this){
            @Override
            public void hide(){}

            @Override
            public boolean dispatchKeyEvent(KeyEvent event){
                if(event.getKeyCode() == KeyEvent.KEYCODE_BACK)
                    finish();
                return super.dispatchKeyEvent(event);
            }
        };
        controller.setAnchorView(video);
        video.setMediaController(controller);
        layout.addView(video);
        video.start();
    }

    public void volvercuentos(View view)
    {
        Intent intent=new Intent(this,MenuVerCuentosActivity.class);
        startActivity(intent);
    }





}
