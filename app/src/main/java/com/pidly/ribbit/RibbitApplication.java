package com.pidly.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "o18EyhhhNryYzuLrwHhc9OW7CXMfN7Po13TP9Dmg", "TmoVocOekXiedQuSt1FNeGdRKEzzwffPwgGHNzcu");
    }
}
