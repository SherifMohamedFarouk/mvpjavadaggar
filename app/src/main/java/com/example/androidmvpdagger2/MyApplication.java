package com.example.androidmvpdagger2;

import android.app.Activity;
import android.app.Application;

import com.example.androidmvpdagger2.Utils.ContextModule;
import com.example.androidmvpdagger2.di.ApplicationComponent;
import com.example.androidmvpdagger2.di.DaggerApplicationComponent;

public class MyApplication extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
        applicationComponent.injectApplication(this);

    }

    public static MyApplication get(Activity activity){
        return (MyApplication) activity.getApplication();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
