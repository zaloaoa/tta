package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 27/01/2016.
 */
public class Zenbakia {
    private ArrayList zenbakiak=new ArrayList<Zenbakiak>();
    public Zenbakia(){

    }

    public ArrayList<Zenbakiak>getZenbakiak(){
        return zenbakiak;
    }


    public static class Zenbakiak{


        private String palabraCastellano;
        private String tablaTraduccioncol;

        public Zenbakiak(){

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
