package com.tispunshahryar960103.digishop.ui.main.home

import com.google.gson.JsonObject
import com.tispunshahryar960103.digishop.models.IMessageResponseListener
import javax.inject.Inject

class HomePresenter constructor(private val iHomeView: IHomeView<Any> ,private val homeInteractor:HomeInteractor=HomeInteractor())  {

    fun getHomeWebService() {

        iHomeView.showProgressbar()



       homeInteractor.getHomeData(object :IMessageResponseListener<Any>{
           override fun onSuccesss(responseMessage: Any) {

               iHomeView.hideProgressbar()
              iHomeView.onSuccess(responseMessage)


           }

           override fun onErrorr(errorResponse: String) {
               iHomeView.hideProgressbar()
              iHomeView.onError(errorResponse)

           }

       })


    }





}