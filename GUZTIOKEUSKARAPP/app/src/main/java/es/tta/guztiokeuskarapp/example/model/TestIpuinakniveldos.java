package es.tta.guztiokeuskarapp.example.model;

import java.io.Serializable;

/**
 * Created by Usuario on 10/01/2016.
 */
public class TestIpuinakniveldos implements Serializable {
    private String wording;//el enunciado
    private String audio;//el audio

    public TestIpuinakniveldos(String Wording,String Audio){
        wording=Wording;
        audio=Audio;
    }

    public String getWording(){
    return wording;
    }

    public String getAudio(){
        return audio;
    }
}
