package h_sed.example.com.madwehater.mappings;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by hsedghinezhad on 11/02/2016.
 */
public class InfoWundergroundResponse implements Serializable {

    @SerializedName("version")
    private String myVersion;

    @SerializedName("termsofService")
    private String myTermsofService;

    @SerializedName("features")
    private Features myFeatures;

    @SerializedName("error")
    private Error myError;

    public String getMyVersion() {
        return myVersion;
    }

    public void setMyVersion(String myVersion) {
        this.myVersion = myVersion;
    }

    public String getMyTermsofService() {
        return myTermsofService;
    }

    public void setMyTermsofService(String myTermsofService) {
        this.myTermsofService = myTermsofService;
    }

    public Features getMyFeatures() {
        return myFeatures;
    }

    public void setMyFeatures(Features myFeatures) {
        this.myFeatures = myFeatures;
    }

    public Error getMyError() {
        return myError;
    }

    public void setMyError(Error myError) {
        this.myError = myError;
    }

    public static class Features {
        @SerializedName("forecast")
        private String myForecast;

        public String getMyForecast() {
            return myForecast;
        }

        public void setMyForecast(String myForecast) {
            this.myForecast = myForecast;
        }
    }

    public static class Error {
        @SerializedName("type")
        private String myType;

        @SerializedName("description")
        private String myDescription;

        public String getMyType() {
            return myType;
        }

        public void setMyType(String myType) {
            this.myType = myType;
        }

        public String getMyDescription() {
            return myDescription;
        }

        public void setMyDescription(String myDescription) {
            this.myDescription = myDescription;
        }
    }


}
