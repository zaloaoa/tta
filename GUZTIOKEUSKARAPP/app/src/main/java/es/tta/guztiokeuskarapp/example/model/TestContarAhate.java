package es.tta.guztiokeuskarapp.example.model;

import java.io.Serializable;

/**
 * Created by Usuario on 06/01/2016.
 */
public class TestContarAhate implements Serializable {
    private int imagen;

    public TestContarAhate(int Imagen){
        imagen=Imagen;
    }

    public int getImagen(){
        return imagen;
    }
}
