package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.R;
import es.tta.guztiokeuskarapp.example.model.TestAbestiakniveltres;

/**
 * Created by Usuario on 03/01/2016.
 */
public class DataAbestiakniveltres implements Serializable {
    private int i;
    private int max;

    TestAbestiakniveltres [] test;
    public DataAbestiakniveltres(){

        test=new TestAbestiakniveltres[4];
        //primera pregunta
        String correct0="jolastu";
        test[0]=new TestAbestiakniveltres("Begi bat ixten du ... nahi badu",correct0);
        //segunda pregunta
        String correct1="xaboitu";
        test[1]=new TestAbestiakniveltres("Hartu esponja ta ... burua busti",correct1);
        //tercera pregunta
        String correct2="tronpeta";
        test[2]=new TestAbestiakniveltres("... nik jotzen det! Tuturu, tuturu, tuturu, tuturu",correct2);
        //cuarta pregunta
        String correct3="tronpa";
        test[3]=new TestAbestiakniveltres("triziklo gainean, ... du aurrean",correct3);

        i=0;
        max=4;


    }

    public TestAbestiakniveltres getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];
    
    }
}
