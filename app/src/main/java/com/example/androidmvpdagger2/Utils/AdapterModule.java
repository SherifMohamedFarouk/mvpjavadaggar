package com.example.androidmvpdagger2.Utils;


import com.example.androidmvpdagger2.Scope.ActivityScope;
import com.example.androidmvpdagger2.UI.MainActivity;
import com.example.androidmvpdagger2.UI.RecyclerViewAdapter;

import dagger.Module;
import dagger.Provides;

@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {

    @Provides
    @ActivityScope
    public RecyclerViewAdapter getCoinList(RecyclerViewAdapter.ClickListener clickListener) {
        return new RecyclerViewAdapter(clickListener);
    }

    @Provides
    @ActivityScope
    public RecyclerViewAdapter.ClickListener getClickListener(MainActivity mainActivity) {
        return mainActivity;
    }
}