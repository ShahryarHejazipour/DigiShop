package com.tispunshahryar960103.digishop.ui.loginMVP

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.tispunshahryar960103.digishop.R
import com.tispunshahryar960103.digishop.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(),ILoginView,View.OnClickListener {

    lateinit var binding:FragmentLoginBinding

    @Inject
    lateinit var loginPresenter: LoginPresenter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(inflater,container,false)

        binding.btnLogin.setOnClickListener(this)



        return binding.root
    }

    override fun onClick(v: View?) {

        loginPresenter.login(binding.edtUsername.text.toString(),binding.edtPassword.text.toString())


    }

    override fun onUsernameError() {

        binding.edtUsername.error=getString(R.string.username_required)
    }

    override fun onPasswordError() {
        binding.edtPassword.error=getString(R.string.password_requared)
    }

    override fun onFailure() {

        Toast.makeText(
            requireActivity(),
            R.string.failedLogin,
            Toast.LENGTH_SHORT
        ).show()


    }

    override fun onSuccess() {

        Log.e("success", "success")
    }

    override fun showProgressbar() {

        binding.progressBar.visibility=View.VISIBLE
    }

    override fun hideProgressbar() {
        binding.progressBar.visibility=View.GONE

    }




}