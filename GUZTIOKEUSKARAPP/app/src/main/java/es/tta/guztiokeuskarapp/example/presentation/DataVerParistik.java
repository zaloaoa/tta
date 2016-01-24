package es.tta.guztiokeuskarapp.example.presentation;

import es.tta.guztiokeuskarapp.example.model.VerParistik;

/**
 * Created by Usuario on 24/01/2016.
 */
public class DataVerParistik {
    public VerParistik getParistik() {
        return paristik;
    }

    private VerParistik paristik;
    public DataVerParistik()
    {
        String enunciado="Paristik natorren";
        String video="http://51.254.221.215/uploads/paris.mp4";
        paristik=new VerParistik(enunciado,video);
    }
}
