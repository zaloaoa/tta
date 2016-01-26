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
import es.tta.guztiokeuskarapp.example.model.VerIkusi;
import es.tta.guztiokeuskarapp.example.presentation.DataVerIkusi;


public class VerIkusiActivity extends AppCompatActivity {
    private DataVerIkusi verikusi;
    private String bideo;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_ikusi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);//
        setSupportActionBar(toolbar);//
        verikusi=new DataVerIkusi();
        VerIkusi cancionikusi=verikusi.getIkusi();
        TextView textWording=(TextView)findViewById(R.id.ikusiikusi);
        textWording.setText(cancionikusi.getWording());
        bideo=cancionikusi.getVideo();
        layout = (LinearLayout) findViewById(R.id.verikusi);


    }

    public void vercancionikusi(View view) throws IOException {
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
