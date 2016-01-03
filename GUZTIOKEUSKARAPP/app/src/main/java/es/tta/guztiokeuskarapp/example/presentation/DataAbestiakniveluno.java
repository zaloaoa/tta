package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.example.model.TestAbestiakniveluno;

/**
 * Created by Usuario on 02/01/2016.
 */
public class DataAbestiakniveluno implements Serializable {

    private int i;
    private int max;

    TestAbestiakniveluno[] test;
    public DataAbestiakniveluno() {
        test = new TestAbestiakniveluno[4];//hay cuatro teses
        /*test primero*/
        String[] choicesWording = new String[4];//4 opciones
        boolean[] choicesCorrect = new boolean[4];
        choicesWording[0] = "txoria";
        choicesCorrect[0] = false;
        choicesWording[1] = "katua";
        choicesCorrect[1] = false;
        choicesWording[2] = "txakurra";
        choicesCorrect[2] = true;
        choicesWording[3] = "sagua";
        choicesCorrect[3] = false;

        test[0] = new TestAbestiakniveluno("Aukeratu hitz zuzena/Elige la opción correcta: Pintto Pintto gure... da", choicesWording, choicesCorrect);
        /*test segundo*/
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "riki";
        choicesCorrect[0] = true;
        choicesWording[1] = "miki";
        choicesCorrect[1] = false;
        choicesWording[2] = "ziki";
        choicesCorrect[2] = false;
        choicesWording[3] = "liki";
        choicesCorrect[3] = false;

        test[1] = new TestAbestiakniveluno("Aukeratu hitz zuzena/Elige la opción correcta: Xalala! riki ..., xalala! riki!ri!", choicesWording, choicesCorrect);
        /*para el tercer test*/
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "natorren";
        choicesCorrect[0] = true;
        choicesWording[1] = "zetorren";
        choicesCorrect[1] = false;
        choicesWording[2] = "datorren";
        choicesCorrect[2] = false;
        choicesWording[3] = "kantari";
        choicesCorrect[3] = false;

        test[2] = new TestAbestiakniveluno("Aukeratu hitz zuzena/Elige la opción correcta: Paristik ... artista bat naiz ni", choicesWording, choicesCorrect);
        //cuarto test
        choicesWording = new String[4];
        choicesCorrect = new boolean[4];
        choicesWording[0] = "bat";
        choicesCorrect[0] = false;
        choicesWording[1] = "ikusi";
        choicesCorrect[1] = true;
        choicesWording[2] = "umea";
        choicesCorrect[2] = false;
        choicesWording[3] = "elefantea";
        choicesCorrect[3] = false;

        test[3] = new TestAbestiakniveluno("Aukeratu hitz zuzena/Elige la opción correcta: Ikusi... han! teilatu gainean", choicesWording, choicesCorrect);
        i = 0;
        max = 4;
    }

    public TestAbestiakniveluno getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];

    }




}
