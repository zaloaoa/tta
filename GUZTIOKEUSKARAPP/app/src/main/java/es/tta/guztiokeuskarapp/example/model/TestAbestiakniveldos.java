package es.tta.guztiokeuskarapp.example.model;

import java.io.Serializable;

/**
 * Created by Usuario on 02/01/2016.
 */
public class TestAbestiakniveldos implements Serializable {
    //sus atributos:
    private String wording;//el enunciado del test
    private Choice[] choices;//tiene las opciones y si son correctas  o no


    public TestAbestiakniveldos(String Wording,String [] choicesWording,boolean [] choicesCorrect){
        wording = Wording;
        if(choicesWording.length == choicesCorrect.length){
            choices = new Choice[choicesCorrect.length];
            int i = 0;
            //rellena las opciones y si es corecto o no:
            for(String choice : choicesWording){
                choices[i] = new Choice(choice,choicesCorrect[i]);
                i++;
            }
        }


    }

    public String getWording(){
        return wording;
    }

    public Choice[] getChoices(){
        return choices;
    }



    public class Choice implements Serializable{

        private String wording;
        private boolean correct;

        public Choice(String Swording, boolean Correct){
            wording=Swording;
            correct=Correct;
        }

        public String getWording(){ return wording;  }

        public boolean isCorrect(){
            return correct;
        }
    }

}
