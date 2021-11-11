package com.tispunshahryar960103.digishop.ui.main.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.tispunshahryar960103.digishop.R
import com.tispunshahryar960103.digishop.databinding.FragmentHomeBinding
import com.tispunshahryar960103.digishop.di.MyApplication
import com.tispunshahryar960103.digishop.models.BaseModel
import com.tispunshahryar960103.digishop.models.Product
import com.tispunshahryar960103.digishop.ui.main.home.adapter.AmazingOfferAdapter
import com.tispunshahryar960103.digishop.ui.main.home.adapter.ProductAdapter
import com.tispunshahryar960103.digishop.webserviceCaller.WebServiceCaller
import dagger.hilt.android.AndroidEntryPoint
import org.json.JSONObject
import javax.inject.Inject


@AndroidEntryPoint
class HomeFragment() : Fragment(), /*IMessageResponseListener<Any>,*/IHomeView<Any> {

    lateinit var binding: FragmentHomeBinding

    @Inject
    lateinit var webServiceCaller: WebServiceCaller

    lateinit var homePresenter: HomePresenter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        //  webServiceCaller.getHomeData()
        showProgressbar()
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

        hideProgressbar()

      /*  Log.e("", "")
        Toast.makeText(MyApplication.appContext, "Home Fragment", Toast.LENGTH_SHORT).show()
*/
        val baseModel=responseMessage as BaseModel

        binding.recyclerViewOffer.layoutManager=LinearLayoutManager(MyApplication.appContext,RecyclerView.HORIZONTAL,false)
        binding.recyclerViewOffer.adapter=ProductAdapter(baseModel.discount)

        binding.recyclerViewSpecial.layoutManager=LinearLayoutManager(MyApplication.appContext,RecyclerView.HORIZONTAL,false)
        binding.recyclerViewSpecial.adapter=AmazingOfferAdapter(baseModel.AmazingOffer)

        binding.recyclerViewSelectionMakeup.layoutManager=LinearLayoutManager(MyApplication.appContext,RecyclerView.HORIZONTAL,false)
        binding.recyclerViewSelectionMakeup.adapter=ProductAdapter(baseModel.makeup)



    }

    override fun onError(errorMessage: String) {
        hideProgressbar()
        Log.e("", "")
        Toast.makeText(MyApplication.appContext, getString(R.string.error_message), Toast.LENGTH_SHORT).show()
    }


}