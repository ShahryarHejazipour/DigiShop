package com.tispunshahryar960103.digishop.ui.main.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.tispunshahryar960103.digishop.databinding.FragmentHomeBinding
import com.tispunshahryar960103.digishop.di.MyApplication
import com.tispunshahryar960103.digishop.models.BaseModel
import com.tispunshahryar960103.digishop.ui.main.home.adapter.ProductAdapter
import com.tispunshahryar960103.digishop.webserviceCaller.WebServiceCaller
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject



@AndroidEntryPoint
class HomeFragment() : Fragment(), /*IMessageResponseListener<Any>,*/IHomeView<Any> {

    lateinit var binding: FragmentHomeBinding

    @Inject
    lateinit var webServiceCaller: WebServiceCaller

    lateinit var homePresenter: HomePresenter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        //  webServiceCaller.getHomeData()
        homePresenter = HomePresenter(this, HomeInteractor())
        homePresenter.getHomeWebService()


        return binding.root
    }

/*    override fun onErrorr(errorResponse: String) {
        Log.e("", "" )
    }

    override fun onSuccesss(responseMessage: Any) {
        Log.e("", "" )
    }*/


    //-----------------------------------------------------
    override fun showProgressbar() {

        binding.progressBar.visibility = View.VISIBLE

    }

    override fun hideProgressbar() {

        binding.progressBar.visibility = View.GONE
    }

    override fun onSuccess(responseMessage: Any) {

        Log.e("", "")
     //   Toast.makeText(MyApplication.appContext, "Home Fragment", Toast.LENGTH_SHORT).show()







   /*     binding.recyclerViewOffer.layoutManager=LinearLayoutManager(MyApplication.appContext,RecyclerView.HORIZONTAL,false)
        binding.recyclerViewOffer.adapter=ProductAdapter(myClass.discount)*/



    }

    override fun onError(errorMessage: String) {
        Log.e("", "")
    }





}