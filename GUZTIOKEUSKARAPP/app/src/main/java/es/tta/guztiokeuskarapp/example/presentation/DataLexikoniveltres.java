package es.tta.guztiokeuskarapp.example.presentation;

import java.io.Serializable;

import es.tta.guztiokeuskarapp.example.model.TestLexikoniveltres;

/**
 * Created by Usuario on 15/01/2016.
 */
public class DataLexikoniveltres implements Serializable {
    private int i;
    private int max;

    private TestLexikoniveltres [] testLexikoniveltres;

    public DataLexikoniveltres(){
        testLexikoniveltres=new TestLexikoniveltres[5];
        //test primero
        String audio0="http://u017633.ehu.eus:18080/Guztiok/audio/bihararte.mp3";
        testLexikoniveltres[0]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta:BIHAR ARTE",audio0);
        //test segundo
        String audio1="http://u017633.ehu.eus:18080/Guztiok/audio/logela.mp3";
        testLexikoniveltres[1]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta: LOGELA",audio1);
        //test tercero
        String audio2="http://u017633.ehu.eus:18080/Guztiok/audio/errotuladorea.mp3";
        testLexikoniveltres[2]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta: ERROTULADOREA",audio2);
        //test cuarto
        String audio3="http://u017633.ehu.eus:18080/Guztiok/audio/komuna.mp3";
        testLexikoniveltres[3]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta:KOMUNA",audio3);
        //test quinto
        String audio4="http://u017633.ehu.eus:18080/Guztiok/audio/lanpara.mp3";
        testLexikoniveltres[4]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta:LANPARA",audio4);

        i=0;
        max=5;
    }

    public TestLexikoniveltres getTestLexikoniveltres(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return testLexikoniveltres[i];
    }
}
