package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.example.model.TestIpuinakniveldos;

/**
 * Created by Usuario on 10/01/2016.
 */
public class DataIpuinakniveldos implements Serializable {
    private int i;
    private int max;

   private TestIpuinakniveldos [] test;

    public  DataIpuinakniveldos(){
        test=new TestIpuinakniveldos[3];
        String audio0="http://51.254.221.215/uploads/pr.ogg";
        test[0]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: AIZKOLARIA",audio0);
        String audio1="http://51.254.221.215/uploads/pr.ogg";
        test[1]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: HIRU TXERRIKUMEAK",audio1);
        String audio2="http://51.254.221.215/uploads/pr.ogg";
        test[2]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: AHATETXOA",audio2);


        i=0;
        max=3;

    }

    public TestIpuinakniveldos getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];
    }
}
