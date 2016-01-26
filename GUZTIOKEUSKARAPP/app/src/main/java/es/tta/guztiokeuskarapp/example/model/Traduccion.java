package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 24/01/2016.
 */
public class Traduccion {

    private ArrayList agurrak=new ArrayList<Agurrak>();
    public Traduccion(){

    }
    public ArrayList<Agurrak> getAgurrak() {
        return agurrak;
    }
    public Agurrak getAgurra(int i){

        return (Agurrak) agurrak.get(i);
    }


    public static class Agurrak{

        private String palabraCastellano;
        private String tablaTraduccioncol;

        public Agurrak(){

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
