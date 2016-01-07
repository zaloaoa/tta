package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.example.model.TestLexikoniveldos;

/**
 * Created by Usuario on 03/01/2016.
 */
public class DataLexikoniveldos implements Serializable  {
    private int i;
    private int max;

    TestLexikoniveldos [] test;

    public DataLexikoniveldos(){
        test=new TestLexikoniveldos[4];
         /*test primero*/
        String[] choicesWording = new String[4];//4 opciones
        boolean[] choicesCorrect = new boolean[4];
        choicesWording[0] = "Egun on";
        choicesCorrect[0] = false;
        choicesWording[1] = "Arratsaldeon";
        choicesCorrect[1] = false;
        choicesWording[2] = "Eguerdi on";
        choicesCorrect[2] = true;
        choicesWording[3] = "Gabon";
        choicesCorrect[3] = false;

        test[0] = new TestLexikoniveldos("Tu hijo llega de la escuela a la hora de comer. ¿Qué le dirías? ", choicesWording, choicesCorrect);
        /*test segundo*/
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "Polita";
        choicesCorrect[0] = true;
        choicesWording[1] = "Zaharra";
        choicesCorrect[1] = false;
        choicesWording[2] = "Luzea";
        choicesCorrect[2] = false;
        choicesWording[3] = "Laburra";
        choicesCorrect[3] = false;

        test[1] = new TestLexikoniveldos("¿Cómo se dice bonito en euskara?", choicesWording, choicesCorrect);
        /*para el tercer test*/
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "Arreba";
        choicesCorrect[0] = false;
        choicesWording[1] = "Amama";
        choicesCorrect[1] = false;
        choicesWording[2] = "Ahizpa";
        choicesCorrect[2] = false;
        choicesWording[3] = "Izeko";
        choicesCorrect[3] = true;

        test[2] = new TestLexikoniveldos("¿Cómo se dice tía en euskara?", choicesWording, choicesCorrect);
        //cuarto test
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "Zortzi";
        choicesCorrect[0] = false;
        choicesWording[1] = "Hamar";
        choicesCorrect[1] = false;
        choicesWording[2] = "Bederatzi";
        choicesCorrect[2] = true;
        choicesWording[3] = "bost";
        choicesCorrect[3] = false;

        test[3] = new TestLexikoniveldos("Cómo se dice nueve en euskara?", choicesWording, choicesCorrect);
        i = 0;
        max = 4;

    }

    public TestLexikoniveldos getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];
    }
}
