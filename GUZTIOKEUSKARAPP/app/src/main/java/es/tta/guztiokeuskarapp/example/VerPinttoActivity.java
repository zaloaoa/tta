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
import es.tta.guztiokeuskarapp.example.model.VerPintto;
import es.tta.guztiokeuskarapp.example.presentation.DataVerPintto;

public class VerPinttoActivity extends AppCompatActivity {
    private DataVerPintto verpintto;
    private String bideo;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_pintto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        verpintto=new DataVerPintto();
        VerPintto cancionpintto=verpintto.getPintto();//consigo el cuento
        TextView textWording=(TextView)findViewById(R.id.ikusipintto);
        textWording.setText(cancionpintto.getWording());
        bideo=cancionpintto.getVideo();
        layout = (LinearLayout) findViewById(R.id.verpintto);

    }
    public void vercancionpintto(View view) throws IOException {
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
    public void volvercanciones(View view)
    {
        Intent intent=new Intent(this, CancionesActivity.class);
        startActivity(intent);
    }

}
