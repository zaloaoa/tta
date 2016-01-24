package es.tta.guztiokeuskarapp.example.presentation;

import es.tta.guztiokeuskarapp.example.model.VerPintto;

/**
 * Created by Usuario on 23/01/2016.
 */
public class DataVerPintto {


    private VerPintto pintto;

    public DataVerPintto()
    {
        String enunciado="Pintto Pintto";
        String video="http://51.254.221.215/uploads/pintto.mp4";
        pintto=new VerPintto(enunciado,video);
    }
    public VerPintto getPintto() {
        return pintto;
    }

}
