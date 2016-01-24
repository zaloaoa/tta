package es.tta.guztiokeuskarapp.example.presentation;

import es.tta.guztiokeuskarapp.example.model.VerIkusi;

/**
 * Created by Usuario on 24/01/2016.
 */
public class DataVerIkusi {
    public VerIkusi getIkusi() {
        return ikusi;
    }

    private VerIkusi ikusi;
    public DataVerIkusi()
    {
        String enunciado="Ikusi ikusi han";
        String video="http://51.254.221.215/uploads/ikusi.mp4";
        ikusi=new VerIkusi(enunciado,video);
    }
}
