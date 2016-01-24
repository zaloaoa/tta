package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.example.model.TestIpuinakniveltres;

/**
 * Created by Usuario on 24/01/2016.
 */
public class DataIpuinakniveltres implements Serializable {
    private int i;
    private int max;

    private TestIpuinakniveltres[] test;
    public DataIpuinakniveltres(){
        test=new TestIpuinakniveltres[3];
        String audio0="http://51.254.221.215/uploads/hirutxerrikumeak2.mp3";
        test[0]=new TestIpuinakniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta: Hiru txerrikumeak bere amaren etxetik joan ziren eta bakoitzak bere etxea egin zuen",audio0);
        String audio1="http://51.254.221.215/uploads/txanogorritxo2.mp3";
        test[1]=new TestIpuinakniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta:Txanogorritxo izeneko neska batek bere amona gaixoari janaria eraman behar zion",audio1);
        String audio2="http://51.254.221.215/uploads/ahateitsusia2.mp3";
        test[2]=new TestIpuinakniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta:Gauzak honela,udaberria iritsi zenean ahatetxoa bere urmaelera itzuli zen, urmael horretan hiru zisne eder ikusi zituen ",audio2);

        i=0;
        max=3;

    }

    public TestIpuinakniveltres getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];
    }
}
