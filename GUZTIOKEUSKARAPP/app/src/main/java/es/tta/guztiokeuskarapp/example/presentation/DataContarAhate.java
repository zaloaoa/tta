package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestContarAhate;

/**
 * Created by Usuario on 06/01/2016.
 */
public class DataContarAhate implements Serializable {
    private int i;
    private int max;

    TestContarAhate []test;

    public DataContarAhate(){
        test=new TestContarAhate[7];

        test[0]=new TestContarAhate(R.drawable.ahateitsusia8);
        test[1]=new TestContarAhate(R.drawable.ahateitsusia1);
        test[2]=new TestContarAhate(R.drawable.ahateitsusia2);
        test[3]=new TestContarAhate(R.drawable.ahateitsusia3);
        test[4]=new TestContarAhate(R.drawable.ahateitsusia4);
        test[5]=new TestContarAhate(R.drawable.ahateitsusia5);
        test[6]=new TestContarAhate(R.drawable.ahateitsusia6);


        i=0;
        max=7;
    }

    public TestContarAhate getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];




    }
}
