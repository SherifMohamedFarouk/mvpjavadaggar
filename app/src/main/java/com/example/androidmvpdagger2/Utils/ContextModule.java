package com.example.androidmvpdagger2.Utils;

import android.content.Context;

import com.example.androidmvpdagger2.Qualifier.ApplicationContext;
import com.example.androidmvpdagger2.Scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}