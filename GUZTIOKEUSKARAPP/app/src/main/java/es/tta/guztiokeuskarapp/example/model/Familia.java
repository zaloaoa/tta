package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 27/01/2016.
 */
public class Familia {
    private ArrayList familiak=new ArrayList<Familiak>();
    public Familia(){

    }
    public ArrayList<Familiak>getFamiliak(){
        return familiak;
    }
    public Familiak getFamilia(int i)
    {
        return (Familiak)familiak.get(i);
    }

    public static class Familiak
    {
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

        private String palabraCastellano;
        private String tablaTraduccioncol;

    }
}
