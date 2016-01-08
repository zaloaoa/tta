package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.example.model.TestAbestiakniveldos;

/**
 * Created by Usuario on 02/01/2016.
 */
public class DataAbestiakniveldos implements Serializable {
    private int i;
    private int max;

    TestAbestiakniveldos []test;

    public DataAbestiakniveldos(){
        test=new TestAbestiakniveldos[4];
         /*test primero*/
        String[] choicesWording = new String[4];//4 opciones
        boolean[] choicesCorrect = new boolean[4];
        choicesWording[0] = "Pintto bere izena du";
        choicesCorrect[0] = false;
        choicesWording[1] = "Ehiztaria bere lagun";
        choicesCorrect[1] = true;
        choicesWording[2] = "Belarria luze";
        choicesCorrect[2] = false;
        choicesWording[3] = "Kalera irteteko";
        choicesCorrect[3] = false;

        test[0] = new TestAbestiakniveldos("Aukeratu esaldi zuzena/Elige la frase correcta: Gure txakurtxoa ez da ... ditu txoritxo guztiak ", choicesWording, choicesCorrect);
        /*test segundo*/
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "Bira ipurdia";
        choicesCorrect[0] = true;
        choicesWording[1] = "Bira burua";
        choicesCorrect[1] = false;
        choicesWording[2] = "Oinetan bukaera";
        choicesCorrect[2] = false;
        choicesWording[3] = "Dago gaizki ";
        choicesCorrect[3] = false;

        test[1] = new TestAbestiakniveldos("Aukeratu esaldi zuzena/Elige la frase correcta: Jira ... mugitu beti", choicesWording, choicesCorrect);
        /*para el tercer test*/
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "Pon pon pon!";
        choicesCorrect[0] = false;
        choicesWording[1] = "Natorren artista";
        choicesCorrect[1] = false;
        choicesWording[2] = "Baita guk ere!";
        choicesCorrect[2] = true;
        choicesWording[3] = "Tuturu, tuturu!";
        choicesCorrect[3] = false;

        test[2] = new TestAbestiakniveldos("Aukeratu esaldi zuzena/Elige la frase correcta: Ondo jotzen det!...", choicesWording, choicesCorrect);
        //cuarto test
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "Aurrean, isatsa";
        choicesCorrect[0] = false;
        choicesWording[1] = "Ikusi han!";
        choicesCorrect[1] = false;
        choicesWording[2] = "Elefantea da!";
        choicesCorrect[2] = false;
        choicesWording[3] = "Abere triziklo";
        choicesCorrect[3] = true;

        test[3] = new TestAbestiakniveldos("Aukeratu esaldi zuzena/Elige la frase correcta: Kriston ... batean", choicesWording, choicesCorrect);
        i = 0;
        max = 4;
    }

    public TestAbestiakniveldos getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];
    }
}
