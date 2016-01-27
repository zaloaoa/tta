package es.tta.guztiokeuskarapp.example.presentation;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import es.tta.guztiokeuskarapp.example.model.Ajetivo;
import es.tta.guztiokeuskarapp.example.model.Egunak;
import es.tta.guztiokeuskarapp.example.model.Familia;
import es.tta.guztiokeuskarapp.example.model.Itzulpen;
import es.tta.guztiokeuskarapp.example.model.Kolorea;
import es.tta.guztiokeuskarapp.example.model.Objeto;
import es.tta.guztiokeuskarapp.example.model.Traduccion;
import es.tta.guztiokeuskarapp.example.model.Zenbakia;

/**
 * Created by Usuario on 24/01/2016.
 */
public class Data {
    private final static String EXTRA_TRADUCCION="es.tta.guztiokeuskarapp.traduccion";
    private final static String EXTRA_ITZULPEN="es.tta.guztiokeuskarapp.itzulpen";
    private final static String EXTRA_OBJETO="es.tta.guztiokeuskarapp.objeto";
    private final static String EXTRA_ADJETIVO="es.tta.guztiokeuskarapp.adjetivo";
    private final static String EXTRA_FAMILIA="es.tta.guztiokeuskarapp.familia";
    private final static String EXTRA_EGUNA="es.tta.guztiokeuskarapp.eguna";
    private final static String EXTRA_KOLOREA="es.tta.guztiokeuskarapp.kolorea";
    private final static String EXTRA_ZENBAKIA="es.tta.guztiokeuskarapp.zenbakia";
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

    public Ajetivo getAjetivo(){

        try {
            Ajetivo adjetivo=new Ajetivo();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_ADJETIVO));
            JSONArray array= json.getJSONArray("tablaadjetivo");
            for(int i=0; i<array.length();i++) {
                JSONObject item= array.getJSONObject(i);
                Ajetivo.Adjektiboak adj=new Ajetivo.Adjektiboak();
                adj.setPalabraCastellano(item.getString("palabraCastellano"));
                adj.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                adjetivo.getAdjektiboak().add(adj);
            }

            return adjetivo;


        }
        catch (JSONException e){
            return null;
        }

    }

    public Familia getFamilia(){

        try {
            Familia familia=new Familia();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_FAMILIA));
            JSONArray array= json.getJSONArray("tablafamilia");
            for(int i=0; i<array.length();i++) {
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
    public Egunak getEgunak(){

        try {
            Egunak egunak=new Egunak();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_EGUNA));
            JSONArray array= json.getJSONArray("tablaegunak");
            for(int i=0; i<array.length();i++) {
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
    public Kolorea getKolorea(){

        try {
            Kolorea kolorea=new Kolorea();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_KOLOREA));
            JSONArray array= json.getJSONArray("tablakoloreak");
            for(int i=0; i<array.length();i++) {
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
    public Zenbakia getZenbakia(){

        try {
            Zenbakia zenbakia=new Zenbakia();
            JSONObject json=new JSONObject(bundle.getString(EXTRA_ZENBAKIA));
            JSONArray array= json.getJSONArray("tablazenbakiak");
            for(int i=0; i<array.length();i++) {
                JSONObject item= array.getJSONObject(i);
                Zenbakia.Zenbakiak ze=new Zenbakia.Zenbakiak();
                ze.setPalabraCastellano(item.getString("palabraCastellano"));
                ze.setTablaTraduccioncol(item.getString("tablaTraduccioncol"));
                zenbakia.getZenbakiak().add(ze);
            }

            return zenbakia;


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
            json.put("tablaetxeko", array);
            bundle.putString(EXTRA_OBJETO, json.toString());


        }catch (JSONException e){
            e.printStackTrace();
        }


    }
    public void putAjetivo(Ajetivo adjetivo){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Ajetivo.Adjektiboak adj : adjetivo.getAdjektiboak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",adj.getPalabraCastellano());
                item.put("tablaTraduccioncol",adj.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablaadjetivo", array);
            bundle.putString(EXTRA_ADJETIVO, json.toString());


        }catch (JSONException e){
            e.printStackTrace();
        }


    }

    public void putFamilia(Familia familia){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Familia.Familiak fam : familia.getFamiliak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",fam.getPalabraCastellano());
                item.put("tablaTraduccioncol",fam.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablafamilia", array);
            bundle.putString(EXTRA_FAMILIA, json.toString());


        }catch (JSONException e){
            e.printStackTrace();
        }


    }
    public void putEgunak(Egunak egunak){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Egunak.Eguna eg : egunak.getEgunak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",eg.getPalabraCastellano());
                item.put("tablaTraduccioncol",eg.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablaegunak", array);
            bundle.putString(EXTRA_EGUNA, json.toString());


        }catch (JSONException e){
            e.printStackTrace();
        }


    }
    public void putKolorea(Kolorea kolorea){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Kolorea.Koloreak ko : kolorea.getKoloreak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",ko.getPalabraCastellano());
                item.put("tablaTraduccioncol",ko.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablakoloreak", array);
            bundle.putString(EXTRA_KOLOREA, json.toString());


        }catch (JSONException e){
            e.printStackTrace();
        }


    }
    public void putZenbakia(Zenbakia zenbakia){
        try {
            JSONObject json = new JSONObject();
            JSONArray array = new JSONArray();
            for(Zenbakia.Zenbakiak ze : zenbakia.getZenbakiak()){
                JSONObject item = new JSONObject();
                item.put("palabraCastellano",ze.getPalabraCastellano());
                item.put("tablaTraduccioncol",ze.getTablaTraduccioncol());
                array.put(item);
            }
            json.put("tablazenbakiak", array);
            bundle.putString(EXTRA_ZENBAKIA, json.toString());


        }catch (JSONException e){
            e.printStackTrace();
        }


    }

}
