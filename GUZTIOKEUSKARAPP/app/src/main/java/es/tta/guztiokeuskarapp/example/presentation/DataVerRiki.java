package es.tta.guztiokeuskarapp.example.presentation;

import es.tta.guztiokeuskarapp.example.model.VerRiki;

/**
 * Created by Usuario on 23/01/2016.
 */
public class DataVerRiki {
    public VerRiki getRiki() {
        return riki;
    }

    private VerRiki riki;
    public DataVerRiki()
    {
        String enunciado="Riki riki";
        String video="http://51.254.221.215/uploads/xalala.mp4";
        riki=new VerRiki(enunciado,video);
    }


}
