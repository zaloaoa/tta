package es.tta.guztiokeuskarapp.example.prof.comms;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Usuario on 24/01/2016.
 */
public class RestClient {
    private final String baseURL;
    private final Map<String, String> properties = new HashMap<>();


    public RestClient(String baseURL) {
        this.baseURL = baseURL;
    }

    private HttpURLConnection getConnection(String path) throws IOException {

        URL url = new URL(String.format("%s/%s", baseURL, path));
        Log.e("guztiok",url.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        for (Map.Entry<String, String> property : properties.entrySet())
            conn.setRequestProperty(property.getKey(), property.getValue());
        Log.e("guztiok", "entra en restclient en getConnection");
        return conn;
    }

    public String getString(String path) throws IOException {


        HttpURLConnection conn = null;
        try {
            conn = getConnection(path);
           String string=null;
            Log.e("guztiok", "vamos a leer el cuerpo del http");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                string=br.readLine();
                Log.e("guztiok",string);
                return string;
            }
        } finally {
            if (conn != null)
                conn.disconnect();


        }
    }

    public JSONObject getJson(String path) throws JSONException {
        JSONObject jsonObject = null;

        try {
            jsonObject = new JSONObject(getString(path));

        } catch (JSONException e) {
            Log.i("guztiok","erros al llamar a la funcion getstring");
            e.printStackTrace();
        } catch (IOException e) {
            Log.e("guztiok", e.getMessage());
            e.printStackTrace();
        }
        return jsonObject;
    }
}