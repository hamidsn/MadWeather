package h_sed.example.com.madwehater.adapters;

/**
 * Created by hsedghinezhad on 11/02/2016.
 */
public class Item {
    String imageURL;
    String title;

    public Item(String imageUrl, String title) {
        super();
        this.imageURL = imageUrl;
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String image) {
        this.imageURL = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}