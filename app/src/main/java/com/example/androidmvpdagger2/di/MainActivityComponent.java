package com.example.androidmvpdagger2.di;

import android.content.Context;

import com.example.androidmvpdagger2.UI.MainActivity;
import com.example.androidmvpdagger2.Qualifier.ActivityContext;
import com.example.androidmvpdagger2.Scope.ActivityScope;
import com.example.androidmvpdagger2.Utils.AdapterModule;
import com.example.androidmvpdagger2.Utils.MainActivityMvpModule;

import dagger.Component;

@ActivityScope
@Component(modules = {AdapterModule.class, MainActivityMvpModule.class}, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();
    void injectMainActivity(MainActivity mainActivity);
}
