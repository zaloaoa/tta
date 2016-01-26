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
        test=new TestIpuinakniveldos[6];
        String audio0="http://u017633.ehu.eus:18080/Guztiok/audio/aizkolaria.mp3";
        test[0]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: AIZKOLARIA",audio0);
        String audio1="http://u017633.ehu.eus:18080/Guztiok/audio/hirutxerrikumeak.mp3";
        test[1]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: HIRU TXERRIKUMEAK",audio1);
        String audio2="http://u017633.ehu.eus:18080/Guztiok/audio/ahatetxoa.mp3";
        test[2]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: AHATETXOAK",audio2);
        String audio3="http://u017633.ehu.eus:18080/Guztiok/audio/amona.mp3";
        test[3]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: AMONA",audio3);
        String audio4="http://u017633.ehu.eus:18080/Guztiok/audio/otsoa.mp3";
        test[4]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: OTSOA",audio4);
        String audio5="http://u017633.ehu.eus:18080/Guztiok/audio/putzegin.mp3";
        test[5]=new TestIpuinakniveldos("Lee en voz alta la palabra y escucha su pronunciación correcta: PUTZ EGIN",audio5);


        i=0;
        max=6;

    }

    public TestIpuinakniveldos getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];
    }
}
