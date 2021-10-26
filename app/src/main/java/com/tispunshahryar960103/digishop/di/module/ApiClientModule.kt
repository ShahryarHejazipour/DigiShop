package com.tispunshahryar960103.digishop.di.module

import com.tispunshahryar960103.digishop.utils.Constants
import com.tispunshahryar960103.digishop.webservice.IDigiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {

    init {
        System.loadLibrary(Constants.LOAD_LIBRARY_FOR_NDK.constantsName)
    }



    @Provides
    @Singleton
    fun getClient():IDigiService{
        return Retrofit.Builder()
            .baseUrl(baseApiUrl())
           // .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IDigiService::class.java)
    }

    private external fun baseApiUrl(): String


}