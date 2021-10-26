package com.tispunshahryar960103.digishop.ui.loginMVP

interface ILoginView {

    fun onUsernameError()
    fun onPasswordError()
    fun onFailure()
    fun onSuccess()
    fun showProgressbar()
    fun hideProgressbar()


}