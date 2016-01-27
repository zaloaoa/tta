package es.tta.guztiokeuskarapp.example.presentation;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import es.tta.guztiokeuskarapp.example.model.Itzulpen;
import es.tta.guztiokeuskarapp.example.model.Objeto;
import es.tta.guztiokeuskarapp.example.model.Traduccion;

/**
 * Created by Usuario on 24/01/2016.
 */
public class Data {
    private final static String EXTRA_TRADUCCION="es.tta.guztiokeuskarapp.traduccion";
    private final static String EXTRA_ITZULPEN="es.tta.guztiokeuskarapp.itzulpen";
    private final static String EXTRA_OBJETO="es.tta.guztiokeuskarapp.objeto";
    private final Bundle bundle;

    public Data(Bundle bundle) {

        if(bundle ==null)
            bundle = new Bundle();

        this.bundle = bundle;
    }

    public Bundle getBundle() {

        return bundle;
    }

    public Traduccion getTraduccion(){

        try {
            Traduccion traduccion=new Traduccion();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_TRADUCCION));
            JSONArray array= json.getJSONArray("tablatraduccion");
            for(int i=0; i<array.length();i++) {
                JSONObject item= array.getJSONObject(i);
                Traduccion.Agurrak agurra=new Traduccion.Agurrak();
                agurra.setPalabraCastellano(item.getString("palabraCastellano"));
                agurra.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                traduccion.getAgurrak().add(agurra);
            }
            Log.e("guztiok", "entra en data en getTraduccion"+traduccion.toString());
            return traduccion;


        }
        catch (JSONException e){
            return null;
        }

    }
    public Itzulpen getItzulpen(){

        try {
            Itzulpen itzulpen=new Itzulpen();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_ITZULPEN));
            JSONArray array= json.getJSONArray("tablaeskola");
            for(int i=0; i<array.length();i++) {
                JSONObject item= array.getJSONObject(i);
                Itzulpen.Eskola eskola=new Itzulpen.Eskola();
                eskola.setPalabraCastellano(item.getString("palabraCastellano"));
                eskola.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                itzulpen.getEskolak().add(eskola);
            }
            Log.e("guztiok", "entra en data en getItzulpen"+itzulpen.toString());
            return itzulpen;


        }
        catch (JSONException e){
            return null;
        }

    }
    public Objeto getObjeto(){

        try {
            Objeto objeto=new Objeto();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_OBJETO));
            JSONArray array= json.getJSONArray("tablaetxeko");
            for(int i=0; i<array.length();i++) {
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

    public void putTraduccion(Traduccion traduccion){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Traduccion.Agurrak agurrak : traduccion.getAgurrak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",agurrak.getPalabraCastellano());
                item.put("tablaTraduccioncol",agurrak.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablatraduccion",array);
            bundle.putString(EXTRA_TRADUCCION, json.toString());//propagar
            Log.e("guztiok", "entra en data putTraduccion"+json.toString());

        }catch (JSONException e){
            e.printStackTrace();
        }


    }

    public void putItzulpen(Itzulpen itzulpen){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Itzulpen.Eskola eskolak : itzulpen.getEskolak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",eskolak.getPalabraCastellano());
                item.put("tablaTraduccioncol",eskolak.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablaeskola",array);
            bundle.putString(EXTRA_ITZULPEN, json.toString());
            Log.e("guztiok", "entra en data putItzulpen"+json.toString());

        }catch (JSONException e){
            e.printStackTrace();
        }


    }

    public void putObjeto(Objeto objeto){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Objeto.Objektuak etxeko : objeto.getObjektuak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",etxeko.getPalabraCastellano());
                item.put("tablaTraduccioncol",etxeko.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablaetxeko",array);
            bundle.putString(EXTRA_OBJETO, json.toString());


        }catch (JSONException e){
            e.printStackTrace();
        }


    }

}
