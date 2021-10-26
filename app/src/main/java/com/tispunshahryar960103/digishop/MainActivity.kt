package com.tispunshahryar960103.digishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationBarView
import com.tispunshahryar960103.digishop.databinding.ActivityMainBinding
import com.tispunshahryar960103.digishop.di.MyApplication
import com.tispunshahryar960103.digishop.utils.Constants
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    companion object {
        init {
            System.loadLibrary(Constants.LOAD_LIBRARY_FOR_NDK.constantsName)
        }

    }


    lateinit var binding: ActivityMainBinding


   // @QualifierNavControllerForFragmentContainer
   // @Inject
    lateinit var navController: NavController





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        //supportActionBar


        /*
        Setting the Navigation between fragments in bottomNavigationView
         */
        navController = Navigation.findNavController(this, R.id.fragmentContainerView)
        NavigationUI.setupActionBarWithNavController(this, navController)
        binding.bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener {


            when (it.itemId) {

                R.id.item_home -> {
                    navController.navigate(R.id.homeFragment)

                }
                R.id.item_category -> {
                    navController.navigate(R.id.categoriesFragment)

                }

                R.id.item_cart -> {
                    navController.navigate(R.id.shoppingCartFragment)

                }
                R.id.item_profile -> {
                    navController.navigate(R.id.profileFragment)

                }

            }

            return@OnItemSelectedListener true

        })


        //Just for Testing the NDK Encrypting the Strings
        val message: String = stringFromJNI()
       // Toast.makeText(MyApplication.appContext, message, Toast.LENGTH_SHORT).show()


    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
    }


    private external fun stringFromJNI(): String


}