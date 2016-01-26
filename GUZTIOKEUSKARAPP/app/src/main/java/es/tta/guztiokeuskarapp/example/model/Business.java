package es.tta.guztiokeuskarapp.example.model;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import es.tta.guztiokeuskarapp.example.prof.comms.RestClient;

/**
 * Created by Usuario on 24/01/2016.
 */
public class Business {
    private final RestClient rest;
    public Business(RestClient rest){
        this.rest=rest;
    }
    public Traduccion getTraduccion(String a)throws IOException,JSONException{
        try{
            Traduccion traduccion=new Traduccion();
            JSONObject json= rest.getJson(String.format(a));
            JSONArray array=json.getJSONArray("tablatraduccion");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Traduccion.Agurrak agurra=new Traduccion.Agurrak();
                agurra.setPalabraCastellano(item.getString("palabraCastellano"));
                agurra.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                traduccion.getAgurrak().add(agurra);
                Log.e("guztiok", "entra en business en getTraduccion");
            }
            return traduccion;

        }
        catch (JSONException e){
            return null;
        }
    }
    public Itzulpen getItzulpen(String a)throws IOException,JSONException{
        try{
            Itzulpen itzulpen=new Itzulpen();
            JSONObject json= rest.getJson(String.format(a));
            JSONArray array=json.getJSONArray("tablaeskola");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Itzulpen.Eskola eskola=new Itzulpen.Eskola();
                eskola.setPalabraCastellano(item.getString("palabraCastellano"));
                eskola.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                itzulpen.getEskolak().add(eskola);
                Log.e("guztiok", "entra en business en getItzulpen");
            }
            return itzulpen;

        }
        catch (JSONException e){
            return null;
        }
    }

}
