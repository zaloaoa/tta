package es.tta.guztiokeuskarapp.example.model;

import java.io.Serializable;

/**
 * Created by Usuario on 24/01/2016.
 */
public class TestIpuinakniveltres implements Serializable {
    private String wording;
    private String audioo;

    public TestIpuinakniveltres(String Wording,String Audio){
        wording=Wording;
        audioo=Audio;
    }

    public String getWording(){
        return wording;
    }
    public String getAudio(){
        return audioo;
    }
}
