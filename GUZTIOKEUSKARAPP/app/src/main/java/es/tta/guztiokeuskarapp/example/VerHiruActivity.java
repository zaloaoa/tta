package es.tta.guztiokeuskarapp.example;

import android.content.Intent;
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
import es.tta.guztiokeuskarapp.example.model.VerCuentoHiru;

import es.tta.guztiokeuskarapp.example.presentation.DataVerCuentoHiru;


public class VerHiruActivity extends AppCompatActivity {

    private DataVerCuentoHiru verhiru;
   // private String enunciado;
    private String bideo;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_hiru);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        verhiru=new DataVerCuentoHiru();
        VerCuentoHiru cuentohiru=verhiru.getCuentoHiru();//consigo el cuento
        TextView textWording=(TextView)findViewById(R.id.ikusitxerri);
        textWording.setText(cuentohiru.getWording());
       // enunciado=cuentohiru.getWording();
        bideo=cuentohiru.getVideo();
        layout = (LinearLayout) findViewById(R.id.vertres);


    }
    public void vercuentotxerri(View view) throws IOException {
        view.setEnabled(false);
        showVideo();

    }
    public void showVideo()
    {
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

    public void volvercuentos (View view)
    {
        Intent intent=new Intent(this,MenuVerCuentosActivity.class);
        startActivity(intent);
    }


}
