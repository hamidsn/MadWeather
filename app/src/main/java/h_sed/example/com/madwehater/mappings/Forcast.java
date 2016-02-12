package h_sed.example.com.madwehater.mappings;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by hsedghinezhad on 11/02/2016.
 */
public class Forcast implements Serializable {

    @SerializedName("txt_forecast")
    private TxtForecastResponse myTxt_forecast;

    @SerializedName("simpleforecast")
    private SimpleForecastResponse mySimpleforecast;

    public TxtForecastResponse getMyTxt_forecast() {
        return myTxt_forecast;
    }

    public void setMyTxt_forecast(TxtForecastResponse myTxt_forecast) {
        this.myTxt_forecast = myTxt_forecast;
    }

    public SimpleForecastResponse getMySimpleforecast() {
        return mySimpleforecast;
    }

    public void setMySimpleforecast(SimpleForecastResponse mySimpleforecast) {
        this.mySimpleforecast = mySimpleforecast;
    }

}
