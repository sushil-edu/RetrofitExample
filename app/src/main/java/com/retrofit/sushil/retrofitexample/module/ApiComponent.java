package com.retrofit.sushil.retrofitexample.module;

import com.retrofit.sushil.retrofitexample.MyApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sushil on 6/20/2018.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent {
    void inject(MyApplication activity);
}