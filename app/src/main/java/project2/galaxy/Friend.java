package project2.galaxy;

import android.util.Log;

/**
 * Created by q on 2017-01-02.
 */

public class Friend {
    String name;
    String url;
    boolean isSilhouette;

    public Friend(String name, String url, boolean isSilhouette) {
        this.name = name;
        this.url = url;
        this.isSilhouette = isSilhouette;
    }

    public void printSelf() {
        Log.d("name", this.name);
        Log.d("name", this.url);
        Log.d("name", String.valueOf(this.isSilhouette));
    }
}
