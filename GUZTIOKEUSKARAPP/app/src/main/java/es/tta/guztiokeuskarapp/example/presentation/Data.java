package es.tta.guztiokeuskarapp.example.presentation;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import es.tta.guztiokeuskarapp.example.model.Traduccion;

/**
 * Created by Usuario on 24/01/2016.
 */
public class Data {
    private final static String EXTRA_TRADUCCION="es.tta.guztiokeuskarapp.traduccion";
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

}
