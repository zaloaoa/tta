package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 26/01/2016.
 */
public class Itzulpen {


    private ArrayList eskolak=new ArrayList<Eskola>();

    public ArrayList<Eskola> getEskolak() {
        return eskolak;
    }

    public Eskola getEskola(int i)
    {
        return (Eskola)eskolak.get(i);
    }

    public Itzulpen()
    {

    }
    public static class Eskola
    {
        private String palabraCastellano;
        private String tablaTraduccioncol;

        public Eskola()
        {

        }
        public String getPalabraCastellano() {
            return palabraCastellano;
        }

        public String getTablaTraduccioncol() {
            return tablaTraduccioncol;
        }

        public void setPalabraCastellano(String palabraCastellano) {
            this.palabraCastellano = palabraCastellano;
        }

        public void setTablaTraduccioncol(String tablaTraduccioncol) {
            this.tablaTraduccioncol = tablaTraduccioncol;
        }



    }
}
