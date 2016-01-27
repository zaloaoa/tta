package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 27/01/2016.
 */
public class Kolorea {
    private ArrayList koloreak=new ArrayList<Koloreak>();
    public Kolorea(){

    }

    public ArrayList<Koloreak>getKoloreak(){
        return koloreak;
    }
    public static class Koloreak{


        private String palabraCastellano;
        private String tablaTraduccioncol;

        public Koloreak(){

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
