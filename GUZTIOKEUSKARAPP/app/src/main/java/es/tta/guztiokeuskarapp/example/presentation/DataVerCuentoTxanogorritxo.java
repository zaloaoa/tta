package es.tta.guztiokeuskarapp.example.presentation;

import es.tta.guztiokeuskarapp.example.model.VerCuentoTxanogorritxo;

/**
 * Created by alumno on 15/01/16.
 */
public class DataVerCuentoTxanogorritxo {
    private VerCuentoTxanogorritxo cuentoTxanogorritxo;

    public DataVerCuentoTxanogorritxo()
    {
        String enunciado="Cuento de Caperucita Roja/Txanogorritxo ipuina";
        String video="http://51.254.221.215/uploads/txanogorritxu.mp4";
        cuentoTxanogorritxo=new VerCuentoTxanogorritxo(enunciado,video);
    }
    public VerCuentoTxanogorritxo getCuentoTxanogorritxo()
    {
        return cuentoTxanogorritxo;
    }

}
