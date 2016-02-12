package h_sed.example.com.madwehater;

import com.google.gson.Gson;

import org.json.JSONException;

import java.io.Reader;

import h_sed.example.com.madwehater.mappings.Weather;

/**
 * Created by hsedghinezhad on 11/02/2016.
 */
public class APIParser {
    public static Weather parseWeather(Reader jsonString) throws JSONException {

        return new Gson().fromJson(jsonString, Weather.class);
    }
}
