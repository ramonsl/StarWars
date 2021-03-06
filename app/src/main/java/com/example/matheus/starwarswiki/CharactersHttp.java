package com.example.matheus.starwarswiki;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class CharactersHttp {

    //Connect

    public static String urlApi="https://swapi.co/api/people/";


    private static HttpURLConnection connect(String pName) {

        String newName = pName.replace(" ", "%20");

        final int SECONDS = 10000;

        try {
            java.net.URL url = new URL("https://swapi.co/api/people/?search="+newName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(10 * SECONDS);
            connection.setConnectTimeout(15 * SECONDS);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoOutput(false);
            connection.connect();
            return connection;
        } catch (IOException e) {
            Log.d("ERROR", e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    //Check if it's connected
    public static boolean hasConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        return (info != null && info.isConnected());

    }


    private static String bytesToString(InputStream inputStream) {
        byte[] buffer = new byte[1024];
        ByteArrayOutputStream bufferzao = new ByteArrayOutputStream();
        int byteslidos;
        try {
            while ((byteslidos = inputStream.read(buffer)) != -1) {
                bufferzao.write(buffer, 0, byteslidos);

            }
            return new String(bufferzao.toByteArray(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
