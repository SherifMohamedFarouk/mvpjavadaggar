package com.example.androidmvpdagger2.mvp;

import com.example.androidmvpdagger2.Model.Catt;

import java.util.List;

public interface MainActivityContract {
    interface View {
        void showData(List<Catt> data);

        void showError(String message);

        void showComplete();

        void showProgress();

        void hideProgress();
    }

    interface Presenter {
        void loadData();
    }
}
