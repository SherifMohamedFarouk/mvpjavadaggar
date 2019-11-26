package com.example.androidmvpdagger2.di;

import android.content.Context;


import com.example.androidmvpdagger2.MyApplication;
import com.example.androidmvpdagger2.Network.APIInterface;
import com.example.androidmvpdagger2.Network.RetrofitModule;
import com.example.androidmvpdagger2.Qualifier.ApplicationContext;
import com.example.androidmvpdagger2.Scope.ApplicationScope;
import com.example.androidmvpdagger2.Utils.ContextModule;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    APIInterface getApiInterface();

    @ApplicationContext
    Context getContext();
    
    void injectApplication(MyApplication myApplication);
}
