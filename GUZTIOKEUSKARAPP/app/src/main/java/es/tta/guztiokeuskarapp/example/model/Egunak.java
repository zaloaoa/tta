package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 27/01/2016.
 */
public class Egunak {
    private ArrayList egunak=new ArrayList<Eguna>();

    public Egunak(){

    }

    public ArrayList<Eguna>getEgunak(){
        return egunak;
    }


    public static class Eguna{

        private String palabraCastellano;
        private String tablaTraduccioncol;

        public Eguna(){

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
