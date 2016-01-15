package es.tta.guztiokeuskarapp.example.model;

/**
 * Created by alumno on 15/01/16.
 */
public class VerCuentoTxanogorritxo {
    private String wording;//nombre del cuento en castellano y euskera
    private String video;//

    public VerCuentoTxanogorritxo(String Wording, String Video)
    {
        wording=Wording;
        video=Video;
    }

    public String getWording()
    {
        return wording;
    }
    public String getVideo()
    {
        return video;
    }
}
