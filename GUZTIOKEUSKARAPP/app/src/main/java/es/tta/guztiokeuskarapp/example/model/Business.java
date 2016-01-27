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

    public Objeto getObjeto(String a)throws IOException,JSONException{
        try{
            Objeto objeto=new Objeto();
            JSONObject json= rest.getJson(String.format(a));
            JSONArray array=json.getJSONArray("tablaetxeko");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Objeto.Objektuak etxeko=new Objeto.Objektuak();
                etxeko.setPalabraCastellano(item.getString("palabraCastellano"));
                etxeko.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                objeto.getObjektuak().add(etxeko);

            }
            return objeto;

        }
        catch (JSONException e){
            return null;
        }
    }
    public Ajetivo getAjetivo(String a)throws IOException,JSONException{
        try{
            Ajetivo ajetivo=new Ajetivo();
            JSONObject json= rest.getJson(String.format(a));
            JSONArray array=json.getJSONArray("tablaadjetivo");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Ajetivo.Adjektiboak adj=new Ajetivo.Adjektiboak();
                adj.setPalabraCastellano(item.getString("palabraCastellano"));
                adj.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                ajetivo.getAdjektiboak().add(adj);

            }
            return ajetivo;

        }
        catch (JSONException e){
            return null;
        }
    }

}
