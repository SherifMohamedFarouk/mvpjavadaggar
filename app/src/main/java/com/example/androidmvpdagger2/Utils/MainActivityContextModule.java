package com.example.androidmvpdagger2.Utils;

import android.content.Context;


import com.example.androidmvpdagger2.Qualifier.ActivityContext;
import com.example.androidmvpdagger2.Scope.ActivityScope;
import com.example.androidmvpdagger2.UI.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;

    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }

}