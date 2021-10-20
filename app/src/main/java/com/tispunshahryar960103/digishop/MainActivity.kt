package com.tispunshahryar960103.digishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.tispunshahryar960103.digishop.databinding.ActivityMainBinding
import com.tispunshahryar960103.digishop.di.MyApplication
import com.tispunshahryar960103.digishop.utils.Constants

class MainActivity : AppCompatActivity() {

companion object{
    init {
        System.loadLibrary(Constants.LOAD_LIBRARY_FOR_NDK.constantsName)
    }

    lateinit var binding:ActivityMainBinding
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(LayoutInflater.from(this),null,false)
        setContentView(binding.root)
       supportActionBar

        val message:String=stringFromJNI()
        Toast.makeText(MyApplication.appContext, message, Toast.LENGTH_SHORT).show()


    }




    private external fun stringFromJNI():String
}