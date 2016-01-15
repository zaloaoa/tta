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
        testLexikoniveltres=new TestLexikoniveltres[3];
        //test primero
        String audio0="http://51.254.221.215/uploads/pr.ogg";
        testLexikoniveltres[0]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta: ZELAN?",audio0);
        //test segundo
        String audio1="http://51.254.221.215/uploads/pr.ogg";
        testLexikoniveltres[1]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta: LOGELA?",audio1);
        //test tercero
        String audio2="http://51.254.221.215/uploads/pr.ogg";
        testLexikoniveltres[2]=new TestLexikoniveltres("Lee en voz alta la palabra y escucha su pronunciación correcta: ERROTULADOREA?",audio2);

        i=0;
        max=3;
    }

    public TestLexikoniveltres getTestLexikoniveltres(){
        if(i==(max-1))
            i=0;
        else
            i++;
        return testLexikoniveltres[i];
    }
}
