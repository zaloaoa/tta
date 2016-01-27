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

    public Familia getFamilia(String a)throws IOException,JSONException{
        try{
            Familia familia=new Familia();
            JSONObject json= rest.getJson(String.format(a));
            JSONArray array=json.getJSONArray("tablafamilia");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Familia.Familiak fam=new Familia.Familiak();
                fam.setPalabraCastellano(item.getString("palabraCastellano"));
                fam.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                familia.getFamiliak().add(fam);

            }
            return familia;

        }
        catch (JSONException e){
            return null;
        }
    }
    public Egunak getEgunak(String a)throws IOException,JSONException{
        try{
            Egunak egunak=new Egunak();
            JSONObject json= rest.getJson(String.format(a));
            JSONArray array=json.getJSONArray("tablaegunak");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Egunak.Eguna eg=new Egunak.Eguna();
                eg.setPalabraCastellano(item.getString("palabraCastellano"));
                eg.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                egunak.getEgunak().add(eg);

            }
            return egunak;

        }
        catch (JSONException e){
            return null;
        }
    }

    public Kolorea getKolorea(String a)throws IOException,JSONException{
        try{
            Kolorea kolorea=new Kolorea();
            JSONObject json= rest.getJson(String.format(a));
            JSONArray array=json.getJSONArray("tablakoloreak");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Kolorea.Koloreak ko=new Kolorea.Koloreak();
                ko.setPalabraCastellano(item.getString("palabraCastellano"));
                ko.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                kolorea.getKoloreak().add(ko);

            }
            return kolorea;

        }
        catch (JSONException e){
            return null;
        }
    }
    public Zenbakia getZenbakia(String ze)throws IOException,JSONException{
        try{
            Zenbakia zenbakia=new Zenbakia();
            JSONObject json= rest.getJson(String.format(ze));
            JSONArray array=json.getJSONArray("tablazenbakiak");
            for(int i=0;i< array.length();i++){
                JSONObject item= array.getJSONObject(i);
                Zenbakia.Zenbakiak zen=new Zenbakia.Zenbakiak();
                zen.setPalabraCastellano(item.getString("palabraCastellano"));
                zen.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                zenbakia.getZenbakiak().add(zen);

            }
            return zenbakia;

        }
        catch (JSONException e){
            return null;
        }
    }

}
