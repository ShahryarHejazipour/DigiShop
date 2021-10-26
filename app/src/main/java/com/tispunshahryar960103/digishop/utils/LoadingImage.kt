package com.tispunshahryar960103.digishop.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object LoadingImage {

    @BindingAdapter("bind:loadImage")
    @JvmStatic
    fun setImage(imageView: ImageView,icon:String){
        Picasso.get().load(icon).into(imageView)
    }


}