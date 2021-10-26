package com.tispunshahryar960103.digishop.webservice

import com.tispunshahryar960103.digishop.models.BaseModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import javax.inject.Inject

interface IDigiService {

    @GET("home.php")
    fun getHomeData():Call<BaseModel>






}