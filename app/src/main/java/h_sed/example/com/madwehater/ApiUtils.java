
// This is how I prefer to use Volley to call the api but Volley is not allowed in this test:




/*
package h_sed.example.com.madwehater;

import android.util.Log;



import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import h_sed.example.com.madwehater.mappings.Weather;


//Created by hsedghinezhad on 11/02/2016.


public class ApiUtils {

    public static final String UTF8 = "UTF-8";
    private final static RequestQueue myMainRequestQueue = Volley
            .newRequestQueue(ApiApplication.getAppContext());


    public static void getWeatherData(final Response.Listener<Weather> listener, Response.ErrorListener
            errorListener, String geoLocation) {
        //Creating URI follow the URI methods
        String url = ApiApplication.getAppContext().getString(R.string.base_url)
                + ApiApplication.getAppContext().getString(R.string.api_key) +
                ApiApplication.getAppContext().getString(R.string.method_guid) +
                geoLocation + ApiApplication.getAppContext().getString(R.string.fileFormat);

        Request<Weather> request = new Request<Weather>(
                Request.Method.GET, url, errorListener) {

            @Override
            protected Response<Weather> parseNetworkResponse(NetworkResponse networkResponse) {

                try {
                    String jsonString = new String(networkResponse.data, UTF8);
                    JSONObject jsonObject = new JSONObject(jsonString);

                    //Parse response in a different class
                    //When we have multiple API calls we send them to this class to parse
                    Weather weather = APIParser.parseWeather(jsonObject);
                    //Send data back to UI thread
                    //Data fetching is done, lets back to the UI
                    //Data binding principals in progress
                    return Response.success(weather,
                            HttpHeaderParser.parseCacheHeaders(networkResponse));
                } catch (JSONException e) {
                    Log.e(ApiUtils.class
                            .getSimpleName(), "Failed communication with API.  [" + e + "]");
                } catch (UnsupportedEncodingException e) {
                    Log.e(ApiUtils.class.getSimpleName(), "A valid json string" +
                            "was not received from the server [" + e + "]");
                }
                //An error occured
                listener.onResponse(null);
                return null;
            }

            @Override
            protected void deliverResponse(Weather weather) {
                listener.onResponse(weather);
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json; charset=utf-8");
                return headers;
            }
        };
        //This queue will manage future API calls when we have multiple calls
        myMainRequestQueue.add(request);
    }


}
*/
