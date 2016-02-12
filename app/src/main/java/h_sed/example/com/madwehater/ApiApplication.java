package h_sed.example.com.madwehater;

import android.app.Application;
import android.content.Context;

/**
 * Created by hsedghinezhad on 11/02/2016.
 */
public class ApiApplication extends Application {
    private static Context myContext;

    @Override
    public void onCreate()

    {
        super.onCreate();
        myContext = this;
    }

    // This will give the whole app one unique context
    // It will be useful if we grow the app with lots of classes
    public static Context getAppContext() {
        return myContext;
    }

}
