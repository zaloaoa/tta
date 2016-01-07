package es.tta.guztiokeuskarapp.example.model;

import java.io.Serializable;

/**
 * Created by Usuario on 05/01/2016.
 */
public class TestContarTxano implements Serializable {
    private int imagen;



    public TestContarTxano(int Imagen){
        imagen=Imagen;

    }


    public int getImagen(){
        return imagen;
    }
}
