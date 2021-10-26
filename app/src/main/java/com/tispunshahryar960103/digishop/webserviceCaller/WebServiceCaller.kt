package com.tispunshahryar960103.digishop.webserviceCaller

import android.util.Log
import android.widget.Toast
import com.tispunshahryar960103.digishop.di.MyApplication
import com.tispunshahryar960103.digishop.models.BaseModel
import com.tispunshahryar960103.digishop.models.IMessageResponseListener
import com.tispunshahryar960103.digishop.webservice.IDigiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class WebServiceCaller @Inject constructor(private val iDigiService: IDigiService/*, private val iMessageResponseListener: IMessageResponseListener<Any>*/){



    fun getHomeData(iMessageResponseListener: IMessageResponseListener<Any>){

        val baseModelCall:Call<BaseModel> =iDigiService.getHomeData()

        baseModelCall.enqueue(object: Callback<BaseModel>{
            override fun onResponse(call: Call<BaseModel>, response: Response<BaseModel>) {
                Log.e("", "" )
                iMessageResponseListener.onSuccesss(response.body().toString())
                Toast.makeText(MyApplication.appContext, "WebServiceCaller", Toast.LENGTH_SHORT).show()

            }

            override fun onFailure(call: Call<BaseModel>, t: Throwable) {
                Log.e("", "" )
                iMessageResponseListener.onErrorr(t.toString())
            }

        })


    }




}