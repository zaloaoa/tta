package es.tta.guztiokeuskarapp.example.presentation;

import es.tta.guztiokeuskarapp.example.model.VerCuentoAhate;

/**
 * Created by Usuario on 23/01/2016.
 */
public class DataVerCuentoAhate {


    private VerCuentoAhate cuentoAhate;
    public DataVerCuentoAhate()
    {
        String enunciado="Cuento del patito feo/Ahate itsusiaren ipuina";
        String video="http://51.254.221.215/uploads/ahateitsusia.mp4";
        cuentoAhate=new VerCuentoAhate(enunciado,video);
    }
    public VerCuentoAhate getCuentoAhate() {
        return cuentoAhate;
    }

}
