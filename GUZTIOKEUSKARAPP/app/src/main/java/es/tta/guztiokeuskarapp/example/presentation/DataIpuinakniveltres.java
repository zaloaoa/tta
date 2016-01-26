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
        test=new TestIpuinakniveltres[6];

        String audio0="http://u017633.ehu.eus:18080/Guztiok/audio/hirutxerrikumeak3.mp3";
        test[0]=new TestIpuinakniveltres("Lee en voz alta la frase y escucha su pronunciación correcta: Anaia nagusienak etxea lastozkoa egin zuen, ertainak zurezkoa eta anaia txikienak adreiluzkoa",audio0);
        String audio1="http://u017633.ehu.eus:18080/Guztiok/audio/txanogorritxo2.mp3";
        test[1]=new TestIpuinakniveltres("Lee en voz alta la frase y escucha su pronunciación correcta:Txanogorritxo izeneko neska batek bere amona gaixoari janaria eraman behar zion",audio1);
        String audio2="http://u017633.ehu.eus:18080/Guztiok/audio/txanogorritxo3.mp3";
        test[2]=new TestIpuinakniveltres("Lee en voz alta la frase y escucha su pronunciación correcta:Baina basoan otsoarekin topatu eta otsoak txanogorritxo jateko asmoz, bide luzea hartzeko engainatu zuen",audio2);
        String audio3="http://u017633.ehu.eus:18080/Guztiok/audio/ahateitsusia2.mp3";
        test[3]=new TestIpuinakniveltres("Lee en voz alta la frase y escucha su pronunciación correcta:Urmael baten ondoan, ahate itsusi bat jaio zen. Oso handia zenez, beste guztiek burla egiten zioten",audio3);
        String audio4="http://u017633.ehu.eus:18080/Guztiok/audio/ahateitsusia3.mp3";
        test[4]=new TestIpuinakniveltres("Lee en voz alta la frase y escucha su pronunciación correcta:Egun batean ahatetxoak bakarrik mundua ezagutzera joatea erabaki zuen. Baina leku guztietan gauza bera esaten zioten: Alde hemendik ahate itsusia! Ahate itsusia oso triste zegoen",audio4);
        String audio5="http://u017633.ehu.eus:18080/Guztiok/audio/hirutxerrikumeak2.mp3";
        test[5]=new TestIpuinakniveltres("Lee en voz alta la frase y escucha su pronunciación correcta: Hiru txerrikumeak bere amaren etxetik joan ziren eta bakoitzak bere etxea egin zuen",audio5);

        i=0;
        max=6;

    }

    public TestIpuinakniveltres getTest(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return test[i];
    }
}
