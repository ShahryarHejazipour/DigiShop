package com.tispunshahryar960103.digishop.ui.main.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tispunshahryar960103.digishop.R
import com.tispunshahryar960103.digishop.databinding.FragmentProfileBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : Fragment() {

    lateinit var binding:FragmentProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentProfileBinding.inflate(inflater,container,false)

        binding.btnLogin.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(it).navigate(R.id.loginFragment)
        })

        return binding.root
    }


}