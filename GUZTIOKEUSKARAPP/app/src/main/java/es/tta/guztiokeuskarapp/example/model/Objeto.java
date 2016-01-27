package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 27/01/2016.
 */
public class Objeto {


    private ArrayList objektuak=new ArrayList<Objektuak>();
    public Objeto()
    {

    }

    public ArrayList<Objektuak> getObjektuak()
    {
        return objektuak;
    }
    public Objektuak getObjektu(int i)
    {
        return (Objektuak)objektuak.get(i);
    }

    public static class Objektuak
    {
        private String tablaTraduccioncol;
        private String palabraCastellano;
        public String getPalabraCastellano() {
            return palabraCastellano;
        }

        public String getTablaTraduccioncol() {
            return tablaTraduccioncol;
        }



        public void setTablaTraduccioncol(String tablaTraduccioncol) {
            this.tablaTraduccioncol = tablaTraduccioncol;
        }

        public void setPalabraCastellano(String palabraCastellano) {
            this.palabraCastellano = palabraCastellano;
        }


        public Objektuak()
        {

        }
    }
}
