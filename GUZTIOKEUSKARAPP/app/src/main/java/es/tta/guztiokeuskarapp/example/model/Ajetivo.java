package es.tta.guztiokeuskarapp.example.model;

import java.util.ArrayList;

/**
 * Created by Usuario on 27/01/2016.
 */
public class Ajetivo {
    private ArrayList adjektiboak=new ArrayList<Adjektiboak>();
    public Ajetivo()
    {

    }
    public ArrayList<Adjektiboak>getAdjektiboak()
    {
        return adjektiboak;
    }

    public Adjektiboak getAdjektiboa(int i)
    {
        return (Adjektiboak)adjektiboak.get(i);
    }

    public static class Adjektiboak
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

        public Adjektiboak()
        {

        }

    }
}
