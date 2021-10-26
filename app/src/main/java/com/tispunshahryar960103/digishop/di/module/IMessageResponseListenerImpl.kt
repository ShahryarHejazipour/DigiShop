package com.tispunshahryar960103.digishop.di.module

import android.util.Log
import com.tispunshahryar960103.digishop.models.IMessageResponseListener
import javax.inject.Inject

class IMessageResponseListenerImpl @Inject constructor() : IMessageResponseListener<Any> {


    override fun onSuccesss(responseMessage: Any) {
        Log.e("", "" )
    }

    override fun onErrorr(errorResponse: String) {
        Log.e("", "" )
    }
}