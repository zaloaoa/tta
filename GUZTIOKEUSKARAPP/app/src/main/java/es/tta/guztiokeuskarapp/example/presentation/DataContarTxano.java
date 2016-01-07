package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestContarTxano;

/**
 * Created by Usuario on 05/01/2016.
 */
public class DataContarTxano implements Serializable {
    private int i;
    private int max;


    TestContarTxano [] test;

    public DataContarTxano(){

        test=new TestContarTxano[6];
        int a=R.drawable.txanogorritxo1;
        test[0]=new TestContarTxano(a);
        test[1]=new TestContarTxano(R.drawable.txanogorritxo2);
        test[2]=new TestContarTxano(R.drawable.txanogorritxo3);
        test[3]=new TestContarTxano(R.drawable.txanogorritxo4);
        test[4]=new TestContarTxano(R.drawable.txanogorritxo5);
        test[5]=new TestContarTxano(R.drawable.txanogorritxo6);

        i=0;
        max=6;

    }
    public TestContarTxano getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];




    }
}
