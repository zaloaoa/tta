package es.tta.guztiokeuskarapp.example.model;

import java.io.Serializable;

/**
 * Created by Usuario on 03/01/2016.
 */
public class TestAbestiakniveltres implements Serializable {
    //sus atributos:
    private String wording;//el enunciado de la pregunta
    private String correct;//la palabra correcta, que hay que introducir


    public TestAbestiakniveltres(String Wording,String Correct){
        wording=Wording;
        correct=Correct;

    }

    public String getWording(){
        return wording;
    }
    public String getCorrect(){
        return correct;
    }
}
