package com.tispunshahryar960103.digishop.models

interface IMessageResponseListener<Any> {

    fun onSuccesss(responseMessage:kotlin.Any)
    fun onErrorr(errorResponse:String)


}