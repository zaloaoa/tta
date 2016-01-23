package es.tta.guztiokeuskarapp.example.presentation;

import es.tta.guztiokeuskarapp.example.model.VerCuentoHiru;

/**
 * Created by Usuario on 23/01/2016.
 */
public class DataVerCuentoHiru {
    private VerCuentoHiru cuentoHiru;



    public DataVerCuentoHiru()
    {
        String enunciado="Cuento de los tres cerditos/Hiru txerrikumeen ipuina";

        String video="http://51.254.221.215/uploads/hirutxerrikumeak.mp4";
        cuentoHiru=new VerCuentoHiru(enunciado,video);
    }
    public VerCuentoHiru getCuentoHiru() {
        return cuentoHiru;
    }
}
