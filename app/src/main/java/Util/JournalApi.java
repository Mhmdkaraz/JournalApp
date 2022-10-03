package Util;

import android.app.Application;

public class JournalApi extends Application {//additional code in manifest to make it public through all the application
    private String username;
    private String userId;
    //since we gonna make this singleton so we are creating an instance of same class inside it
    private static JournalApi instance;

    public static JournalApi getInstance(){
        if(instance == null)
            instance = new JournalApi();
        return instance;
    }

    public JournalApi(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
