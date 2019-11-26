package com.example.androidmvpdagger2.Network;

import com.example.androidmvpdagger2.Model.Catt;

import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Completable;
import rx.Observable;

public interface APIInterface {


    @GET("images/search")
    Observable<List<Catt>> getCats(@Query("limit") int limit );

}
