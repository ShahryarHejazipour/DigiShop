package com.tispunshahryar960103.digishop.ui.main.home

interface IHomeView<in T> {


    fun onError(errorMessage:String)
    fun onSuccess(responseMessage:T)
    fun showProgressbar()
    fun hideProgressbar()


}