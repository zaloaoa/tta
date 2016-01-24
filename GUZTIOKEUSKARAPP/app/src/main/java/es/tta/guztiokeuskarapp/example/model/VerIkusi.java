package es.tta.guztiokeuskarapp.example.model;

/**
 * Created by Usuario on 24/01/2016.
 */
public class VerIkusi {
    public String getWording() {
        return wording;
    }

    public String getVideo() {
        return video;
    }

    private String wording;
    private String video;
    public VerIkusi(String Wording, String Video)
    {
        wording=Wording;
        video=Video;
    }
}
