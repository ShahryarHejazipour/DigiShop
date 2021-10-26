package com.tispunshahryar960103.digishop.ui.main.home

import com.tispunshahryar960103.digishop.di.MyApplication
import com.tispunshahryar960103.digishop.models.IMessageResponseListener
import com.tispunshahryar960103.digishop.webserviceCaller.WebServiceCaller
import com.tispunshahryar960103.digishop.webserviceCaller.di.IWebServiceCallerEntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.android.EntryPointAccessors
import org.json.JSONObject
import javax.inject.Inject

class HomeInteractor {


    /*
    Injection the WebServiceCaller.kt for HomeInteractor.kt With Hilt
     */
    private val iWebServiceCallerEntryPoint: IWebServiceCallerEntryPoint =
        EntryPointAccessors.fromApplication(
            MyApplication.appContext, IWebServiceCallerEntryPoint::class.java
        )

    private val webServiceCaller: WebServiceCaller =
        iWebServiceCallerEntryPoint.provideWebServiceCaller()

    fun getHomeData(listener: IMessageResponseListener<Any>) {

        webServiceCaller.getHomeData(object : IMessageResponseListener<Any> {
            override fun onSuccesss(responseMessage: Any) {

                listener.onSuccesss(responseMessage)

            }

            override fun onErrorr(errorResponse: String) {

                listener.onErrorr(errorResponse)


            }

        })

    }






}