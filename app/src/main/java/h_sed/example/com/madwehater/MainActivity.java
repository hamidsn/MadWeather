package h_sed.example.com.madwehater;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import h_sed.example.com.madwehater.adapters.CustomGridViewAdapter;
import h_sed.example.com.madwehater.adapters.Item;
import h_sed.example.com.madwehater.mappings.Weather;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;
    private String myGeoLocation;
    TextView today;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        today = (TextView) findViewById(R.id.date);
        progressBar = (ProgressBar) findViewById(R.id.toolbar_progress_bar);
        showFetchingProgress(true);
        myGeoLocation = getGeoLocation();
        // app only needs to make a single call at launch
        // Just to check if we have internet
        if (isConnected()) {
            PostFetcher fetcher = new PostFetcher();
            fetcher.execute();
        } else {
            today.setText(getString(R.string.no_connection));
            showFetchingProgress(false);
        }
    }

    private void updateUI(String myDate, int numberOfForecastdays, String[] imageUri, String[] date) {
        //Managing of User Interface
        showFetchingProgress(false);
        if (numberOfForecastdays == 0) {
            //Show the error
            today.setText(myDate);
            return;
        } else {
            for (int i = 0; i < numberOfForecastdays; i++) {
                gridArray.add(new Item(imageUri[i], date[i]));
            }
            today.setText(myDate);
            GridView gridView = (GridView) findViewById(R.id.gridView);
            customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
            gridView.setAdapter(customGridAdapter);
        }

    }

    private void showFetchingProgress(boolean isFetching) {
        // To show a progressBar
        progressBar.setVisibility(isFetching ? View.VISIBLE : View.GONE);
    }

    private String getGeoLocation() {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location location = null;
        //A special location provider for receiving locations without actually initiating a location
        // fix is enough for this sample, we can change to more accurate geoLocations
        location = locationManager.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);

        if (location != null) {
            // return geolocation with the format that API needs
            return String.format("%1$s,%2$s", location.getLatitude(), location.getLongitude());
        } else {
            //TODO: It means location services are off on the device ,
            // we need to load settings page and ask user to enable Locations. On this sample
            // we just use a hardcoded city which is always Sydney
            return getString(R.string.harcoded_location);
        }
    }

    // Calling API in background thread(without 3rd party libs)
    // Please check ApiUtils that is in this package but I don't use it
    // I prefer calling APIs with Volley and set some listeners to the response
    // But it is not allowed for this test
    private class PostFetcher extends AsyncTask<Void, Void, String> {
        String urlString = getString(R.string.base_url) + getString(R.string.api_key) +
                getString(R.string.method_guid) + myGeoLocation + getString(R.string.fileFormat);
        int numberOfForecastdays;
        String[] imageUri, date;
        Weather weather;

        @Override
        protected String doInBackground(Void... params) {
            URL url = null;
            InputStream in = null;
            Reader reader = null;

            try {
                url = new URL(urlString);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            try {
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                // Set the headers
                urlConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                in = new BufferedInputStream(urlConnection.getInputStream());
                reader = new InputStreamReader(in);
                // To parse data I am using GSON
                weather = APIParser.parseWeather(reader);
                // The whole data that API sends is here, ready to use on UI thread
                // We only get some of the items in below
                if (weather.getMyForecast() != null) {
                    numberOfForecastdays = weather.getMyForecast().getMyTxt_forecast().getForecastDay().size();
                    imageUri = new String[numberOfForecastdays];
                    date = new String[numberOfForecastdays];
                    for (int i = 0; i < numberOfForecastdays; i++) {
                        imageUri[i] = weather.getMyForecast().getMyTxt_forecast().getForecastDay().get(i).getMyIcon_url();
                        date[i] = weather.getMyForecast().getMyTxt_forecast().getForecastDay().get(i).getMyTitle();
                    }
                }
            } catch (IOException e) {
                Log.e(MainActivity.class.getSimpleName(), "Failed to get data from urlConnection[" + e + "]");
            } catch (JSONException e) {
                Log.e(MainActivity.class.getSimpleName(), "Failed to parse data from API[" + e + "]");
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            if (weather.getMyForecast() != null) {
                // We have forecast data , show on the UI
                updateUI(weather.getMyForecast().getMyTxt_forecast().getMyDate(), numberOfForecastdays, imageUri, date);
            } else if (weather.getMyResponse() != null) {
                // An error occured, show the error message
                updateUI(weather.getMyResponse().getMyError().getMyDescription(), 0, null, null);
            }
            super.onPostExecute(s);
        }
    }

    public boolean isConnected() {
        // To test the network connection. It is nice to have but it will add a new permission to the app
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }

}



