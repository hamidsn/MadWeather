package h_sed.example.com.madwehater.mappings;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hsedghinezhad on 11/02/2016.
 */
public class SimpleForecastResponse implements Serializable {
    @SerializedName("forecastday")
    private List<Forecastday> myForecastday;

    public List<Forecastday> getMyForecastday() {
        return myForecastday;
    }

    public void setMyForecastday(List<Forecastday> myForecastday) {
        this.myForecastday = myForecastday;
    }
}

class Forecastday {

    @SerializedName("date")
    private DateResponse myDateResponse;

    @SerializedName("period")
    private int myPeriod;

    @SerializedName("high")
    private TemperatureResponse myHigh;

    @SerializedName("low")
    private TemperatureResponse myLow;

    @SerializedName("icon")
    private String myIcon;

    @SerializedName("conditions")
    private String myConditions;

    @SerializedName("icon_url")
    private String myIcon_url;

    @SerializedName("skyicon")
    private String mySkyicon;

    @SerializedName("pop")
    private int myPop;


    @SerializedName("qpf_allday")
    private QpfResponse myQpf_allday;

    @SerializedName("qpf_day")
    private QpfResponse myQpf_day;

    @SerializedName("qpf_night")
    private QpfResponse myQpf_night;

    @SerializedName("snow_allday")
    private SnowResponse mySnow_allday;

    @SerializedName("snow_day")
    private SnowResponse mySnow_day;

    @SerializedName("snow_night")
    private SnowResponse mySnow_night;

    @SerializedName("maxwind")
    private WindResponse myMaxwind;

    @SerializedName("avewind")
    private WindResponse myAvewind;

    @SerializedName("avehumidity")
    private int myAvehumidity;

    @SerializedName("maxhumidity")
    private int myMaxhumidity;

    @SerializedName("minhumidity")
    private int myMinhumidity;

    public DateResponse getMyDateResponse() {
        return myDateResponse;
    }

    public void setMyDateResponse(DateResponse myDateResponse) {
        this.myDateResponse = myDateResponse;
    }

    public int getMyPeriod() {
        return myPeriod;
    }

    public void setMyPeriod(int myPeriod) {
        this.myPeriod = myPeriod;
    }

    public TemperatureResponse getMyHigh() {
        return myHigh;
    }

    public void setMyHigh(TemperatureResponse myHigh) {
        this.myHigh = myHigh;
    }

    public TemperatureResponse getMyLow() {
        return myLow;
    }

    public void setMyLow(TemperatureResponse myLow) {
        this.myLow = myLow;
    }

    public String getMyIcon() {
        return myIcon;
    }

    public void setMyIcon(String myIcon) {
        this.myIcon = myIcon;
    }

    public String getMyConditions() {
        return myConditions;
    }

    public void setMyConditions(String myConditions) {
        this.myConditions = myConditions;
    }

    public String getMyIcon_url() {
        return myIcon_url;
    }

    public void setMyIcon_url(String myIcon_url) {
        this.myIcon_url = myIcon_url;
    }

    public String getMySkyicon() {
        return mySkyicon;
    }

    public void setMySkyicon(String mySkyicon) {
        this.mySkyicon = mySkyicon;
    }

    public int getMyPop() {
        return myPop;
    }

    public void setMyPop(int myPop) {
        this.myPop = myPop;
    }

    public QpfResponse getMyQpf_allday() {
        return myQpf_allday;
    }

    public void setMyQpf_allday(QpfResponse myQpf_allday) {
        this.myQpf_allday = myQpf_allday;
    }

    public QpfResponse getMyQpf_day() {
        return myQpf_day;
    }

    public void setMyQpf_day(QpfResponse myQpf_day) {
        this.myQpf_day = myQpf_day;
    }

    public QpfResponse getMyQpf_night() {
        return myQpf_night;
    }

    public void setMyQpf_night(QpfResponse myQpf_night) {
        this.myQpf_night = myQpf_night;
    }

    public SnowResponse getMySnow_allday() {
        return mySnow_allday;
    }

    public void setMySnow_allday(SnowResponse mySnow_allday) {
        this.mySnow_allday = mySnow_allday;
    }

    public SnowResponse getMySnow_day() {
        return mySnow_day;
    }

    public void setMySnow_day(SnowResponse mySnow_day) {
        this.mySnow_day = mySnow_day;
    }

    public SnowResponse getMySnow_night() {
        return mySnow_night;
    }

    public void setMySnow_night(SnowResponse mySnow_night) {
        this.mySnow_night = mySnow_night;
    }

    public WindResponse getMyMaxwind() {
        return myMaxwind;
    }

    public void setMyMaxwind(WindResponse myMaxwind) {
        this.myMaxwind = myMaxwind;
    }

    public WindResponse getMyAvewind() {
        return myAvewind;
    }

    public void setMyAvewind(WindResponse myAvewind) {
        this.myAvewind = myAvewind;
    }

    public int getMyAvehumidity() {
        return myAvehumidity;
    }

    public void setMyAvehumidity(int myAvehumidity) {
        this.myAvehumidity = myAvehumidity;
    }

    public int getMyMaxhumidity() {
        return myMaxhumidity;
    }

    public void setMyMaxhumidity(int myMaxhumidity) {
        this.myMaxhumidity = myMaxhumidity;
    }

    public int getMyMinhumidity() {
        return myMinhumidity;
    }

    public void setMyMinhumidity(int myMinhumidity) {
        this.myMinhumidity = myMinhumidity;
    }

    public static class DateResponse {
        @SerializedName("epoch")
        private String myEpoch;
        @SerializedName("pretty")
        private String myPretty;
        @SerializedName("day")
        private int myDay;
        @SerializedName("month")
        private int myMonth;
        @SerializedName("year")
        private int myYear;
        @SerializedName("yday")
        private int myYday;
        @SerializedName("hour")
        private int myHour;
        @SerializedName("min")
        private String myMin;
        @SerializedName("sec")
        private String mySec;
        @SerializedName("isdst")
        private String myIsdst;
        @SerializedName("monthname")
        private String myMonthname;
        @SerializedName("monthname_short")
        private String myMonthname_short;
        @SerializedName("weekday_short")
        private String myWeekday_short;
        @SerializedName("weekday")
        private String myWeekday;
        @SerializedName("ampm")
        private String myAmpm;
        @SerializedName("tz_short")
        private String myTz_short;
        @SerializedName("tz_long")
        private String myTz_long;

        public String getMyEpoch() {
            return myEpoch;
        }

        public void setMyEpoch(String myEpoch) {
            this.myEpoch = myEpoch;
        }

        public String getMyPretty() {
            return myPretty;
        }

        public void setMyPretty(String myPretty) {
            this.myPretty = myPretty;
        }

        public int getMyDay() {
            return myDay;
        }

        public void setMyDay(int myDay) {
            this.myDay = myDay;
        }

        public int getMyMonth() {
            return myMonth;
        }

        public void setMyMonth(int myMonth) {
            this.myMonth = myMonth;
        }

        public int getMyYear() {
            return myYear;
        }

        public void setMyYear(int myYear) {
            this.myYear = myYear;
        }

        public int getMyYday() {
            return myYday;
        }

        public void setMyYday(int myYday) {
            this.myYday = myYday;
        }

        public int getMyHour() {
            return myHour;
        }

        public void setMyHour(int myHour) {
            this.myHour = myHour;
        }

        public String getMyMin() {
            return myMin;
        }

        public void setMyMin(String myMin) {
            this.myMin = myMin;
        }

        public String getMySec() {
            return mySec;
        }

        public void setMySec(String mySec) {
            this.mySec = mySec;
        }

        public String getMyIsdst() {
            return myIsdst;
        }

        public void setMyIsdst(String myIsdst) {
            this.myIsdst = myIsdst;
        }

        public String getMyMonthname() {
            return myMonthname;
        }

        public void setMyMonthname(String myMonthname) {
            this.myMonthname = myMonthname;
        }

        public String getMyMonthname_short() {
            return myMonthname_short;
        }

        public void setMyMonthname_short(String myMonthname_short) {
            this.myMonthname_short = myMonthname_short;
        }

        public String getMyWeekday_short() {
            return myWeekday_short;
        }

        public void setMyWeekday_short(String myWeekday_short) {
            this.myWeekday_short = myWeekday_short;
        }

        public String getMyWeekday() {
            return myWeekday;
        }

        public void setMyWeekday(String myWeekday) {
            this.myWeekday = myWeekday;
        }

        public String getMyAmpm() {
            return myAmpm;
        }

        public void setMyAmpm(String myAmpm) {
            this.myAmpm = myAmpm;
        }

        public String getMyTz_short() {
            return myTz_short;
        }

        public void setMyTz_short(String myTz_short) {
            this.myTz_short = myTz_short;
        }

        public String getMyTz_long() {
            return myTz_long;
        }

        public void setMyTz_long(String myTz_long) {
            this.myTz_long = myTz_long;
        }
    }

    public static class TemperatureResponse {
        @SerializedName("fahrenheit")
        private int myFahrenheit;
        @SerializedName("celsius")
        private int myCelsius;

        public int getMyFahrenheit() {
            return myFahrenheit;
        }

        public void setMyFahrenheit(int myFahrenheit) {
            this.myFahrenheit = myFahrenheit;
        }

        public int getMyCelsius() {
            return myCelsius;
        }

        public void setMyCelsius(int myCelsius) {
            this.myCelsius = myCelsius;
        }
    }


    public static class QpfResponse {
        @SerializedName("in")
        private double myIn;
        @SerializedName("mm")
        private double myMm;

        public double getMyIn() {
            return myIn;
        }

        public void setMyIn(double myIn) {
            this.myIn = myIn;
        }

        public double getMyMm() {
            return myMm;
        }

        public void setMyMm(double myMm) {
            this.myMm = myMm;
        }
    }


    public static class SnowResponse {
        @SerializedName("in")
        private double myInSnow;
        @SerializedName("cm")
        private double myCmSnow;

        public double getMyInSnow() {
            return myInSnow;
        }

        public void setMyInSnow(double myInSnow) {
            this.myInSnow = myInSnow;
        }

        public double getMyCmSnow() {
            return myCmSnow;
        }

        public void setMyCmSnow(double myCmSnow) {
            this.myCmSnow = myCmSnow;
        }
    }

    public static class WindResponse {
        @SerializedName("mph")
        private int myMph;
        @SerializedName("kph")
        private int myKph;
        @SerializedName("dir")
        private String myDir;
        @SerializedName("degrees")
        private int myDegrees;

        public int getMyMph() {
            return myMph;
        }

        public int getMyKph() {
            return myKph;
        }

        public String getMyDir() {
            return myDir;
        }

        public int getMyDegrees() {
            return myDegrees;
        }

        public void setMyMph(int myMph) {
            this.myMph = myMph;
        }

        public void setMyKph(int myKph) {
            this.myKph = myKph;
        }

        public void setMyDir(String myDir) {
            this.myDir = myDir;
        }

        public void setMyDegrees(int myDegrees) {
            this.myDegrees = myDegrees;
        }
    }
}