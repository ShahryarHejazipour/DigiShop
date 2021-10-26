package com.tispunshahryar960103.digishop.ui.main.home.di

import android.util.Log
import com.tispunshahryar960103.digishop.ui.main.home.IHomeView
import javax.inject.Inject

class IHomeViewImpl @Inject constructor():IHomeView<Any> {
    override fun onError(errorMessage: String) {
        Log.e("", "" )
    }

    override fun onSuccess(responseMessage: Any) {
        Log.e("", "" )
    }

    override fun showProgressbar() {
        Log.e("", "" )
    }

    override fun hideProgressbar() {
        Log.e("", "" )
    }
}