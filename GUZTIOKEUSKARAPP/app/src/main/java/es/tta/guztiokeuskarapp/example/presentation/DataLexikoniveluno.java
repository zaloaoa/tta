package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.Testlexikoniveluno;

/**
 * Created by Usuario on 13/01/2016.
 */
public class DataLexikoniveluno implements Serializable {
    private int i;
    private int max;
    private Testlexikoniveluno [] testlexikoniveluno;

    public DataLexikoniveluno(){
        testlexikoniveluno=new Testlexikoniveluno[4];//cuatro teses
        String[] choicesWording = new String[3];//3 opciones
        boolean[] choicesCorrect = new boolean[3];

        //test primero
        choicesWording[0]="Umea HANDIA da";
        choicesCorrect[0]=false;
        choicesWording[1]="Umea TXIKIA da";
        choicesCorrect[1]=true;
        choicesWording[2]="Umea ZAHARRA da";
        choicesCorrect[2]=false;

        int Imagen0= R.drawable.umea;
        testlexikoniveluno[0]=new Testlexikoniveluno("PREGUNTA 1:Relaciona la imagen con el personaje",Imagen0,choicesWording,choicesCorrect);

        //test segundo

        choicesWording[0]="Ohea";
        choicesCorrect[0]=true;
        choicesWording[1]="Mahaia";
        choicesCorrect[1]=false;
        choicesWording[2]="Aulkia";
        choicesCorrect[2]=false;

        int Imagen1= R.drawable.ohea;
        testlexikoniveluno[1]=new Testlexikoniveluno("PREGUNTA 2:Relaciona la imagen con el personaje",Imagen1,choicesWording,choicesCorrect);

        i = 0;
        max = 4;

        //test tercero
        choicesWording[0]="Igandea";
        choicesCorrect[0]=false;
        choicesWording[1]="Osteguna";
        choicesCorrect[1]=false;
        choicesWording[2]="Asteazkena";
        choicesCorrect[2]=true;

        int Imagen2= R.drawable.miercoles;
        testlexikoniveluno[2]=new Testlexikoniveluno("PREGUNTA 3:Relaciona la imagen con el personaje",Imagen2,choicesWording,choicesCorrect);

        //test cuarto

        choicesWording[0]="Arkatza";
        choicesCorrect[0]=true;
        choicesWording[1]="Boligrafoa";
        choicesCorrect[1]=false;
        choicesWording[2]="Arbela";
        choicesCorrect[2]=false;

        int Imagen3= R.drawable.arkatza;
        testlexikoniveluno[3]=new Testlexikoniveluno("PREGUNTA 4:Relaciona la imagen con el personaje",Imagen3,choicesWording,choicesCorrect);
    }

    public Testlexikoniveluno getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return testlexikoniveluno[i];

    }



}
