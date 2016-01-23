package es.tta.guztiokeuskarapp.example.model;

/**
 * Created by Usuario on 23/01/2016.
 */
public class VerCuentoAhate {


    private  String wording;
    private String video;

    public VerCuentoAhate(String Wording, String Video)
    {
        wording=Wording;
        video=Video;
    }
    public String getWording() {
        return wording;
    }

    public String getVideo() {
        return video;
    }
}
