package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestIpuinakniveluno;

/**
 * Created by Usuario on 10/01/2016.
 */
public class DataIpuinakniveluno implements Serializable {

    private int i;
    private int max;

    TestIpuinakniveluno [] test;

    public DataIpuinakniveluno(){
        test=new TestIpuinakniveluno[4];
        String[] choicesWording = new String[3];//3 opciones
        boolean[] choicesCorrect = new boolean[3];
        //test primero
        choicesWording[0]="Ahate itsua";
        choicesCorrect[0]=true;
        choicesWording[1]="Zisneak";
        choicesCorrect[1]=false;
        choicesWording[2]="Itsusia deitzen zioten animaliak";
        choicesCorrect[2]=false;

        int Imagen0= R.drawable.ahateitsusi;
        test[0]=new TestIpuinakniveluno("Erlaziona ezazu irudia pertsonaiarekin/Relaciona la imagen con el personaje",Imagen0,choicesWording,choicesCorrect);

        //test segundo
        choicesWording[0]="Ama";
        choicesCorrect[0]=false;
        choicesWording[1]="Aizkolari";
        choicesCorrect[1]=true;
        choicesWording[2]="Otsoa";
        choicesCorrect[2]=false;

        int Imagen1= R.drawable.aizkolari;
        test[1]=new TestIpuinakniveluno("Erlaziona ezazu irudia pertsonaiarekin/Relaciona la imagen con el personaje",Imagen1,choicesWording,choicesCorrect);

        //test tercero
        choicesWording[0]="Txerrikume handia";
        choicesCorrect[0]=false;
        choicesWording[1]="Txerrikume ertaina";
        choicesCorrect[1]=false;
        choicesWording[2]="Txerrikume txikia";
        choicesCorrect[2]=true;

        int Imagen2= R.drawable.txerrikumetxikia;
        test[2]=new TestIpuinakniveluno("Erlaziona ezazu irudia pertsonaiarekin/Relaciona la imagen con el personaje",Imagen2,choicesWording,choicesCorrect);

        //test cuarto
        choicesWording[0]="Zisneak";
        choicesCorrect[0]=false;
        choicesWording[1]="Itsusia deitzen zioten animaliak";
        choicesCorrect[1]=true;
        choicesWording[2]="Ahate itsusia";
        choicesCorrect[2]=false;

        int Imagen3= R.drawable.animaliak;
        test[3]=new TestIpuinakniveluno("Erlaziona ezazu irudia pertsonaiarekin/Relaciona la imagen con el personaje",Imagen3,choicesWording,choicesCorrect);
         i=0;
        max=4;

    }

    public TestIpuinakniveluno getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];

    }
}
