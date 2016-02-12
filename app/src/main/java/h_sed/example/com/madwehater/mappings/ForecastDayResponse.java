package h_sed.example.com.madwehater.mappings;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hsedghinezhad on 11/02/2016.
 */
public class ForecastDayResponse {
    @SerializedName("period")
    private String myPeriod;
    @SerializedName("icon")
    private String myIcon;
    @SerializedName("icon_url")
    private String myIcon_url;
    @SerializedName("title")
    private String myTitle;
    @SerializedName("fcttext")
    private String mtFcttext;
    @SerializedName("fcttext_metric")
    private String myFcttext_metric;
    @SerializedName("pop")
    private String myPop;

    public String getMyPeriod() {
        return myPeriod;
    }

    public void setMyPeriod(String myPeriod) {
        this.myPeriod = myPeriod;
    }

    public String getMyIcon() {
        return myIcon;
    }

    public void setMyIcon(String myIcon) {
        this.myIcon = myIcon;
    }

    public String getMyIcon_url() {
        return myIcon_url;
    }

    public void setMyIcon_url(String myIcon_url) {
        this.myIcon_url = myIcon_url;
    }

    public String getMyTitle() {
        return myTitle;
    }

    public void setMyTitle(String myTitle) {
        this.myTitle = myTitle;
    }

    public String getMtFcttext() {
        return mtFcttext;
    }

    public void setMtFcttext(String mtFcttext) {
        this.mtFcttext = mtFcttext;
    }

    public String getMyFcttext_metric() {
        return myFcttext_metric;
    }

    public void setMyFcttext_metric(String myFcttext_metric) {
        this.myFcttext_metric = myFcttext_metric;
    }

    public String getMyPop() {
        return myPop;
    }

    public void setMyPop(String myPop) {
        this.myPop = myPop;
    }


}
