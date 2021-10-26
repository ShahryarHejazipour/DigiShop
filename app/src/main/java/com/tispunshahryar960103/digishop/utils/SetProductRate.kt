package com.tispunshahryar960103.digishop.utils

import android.widget.RatingBar
import androidx.appcompat.widget.AppCompatRatingBar
import androidx.databinding.BindingAdapter

object SetProductRate {

    @BindingAdapter("bind:setRate")
    fun setRate(ratingBar: AppCompatRatingBar,rate:String){

        ratingBar.rating=rate.toFloat()

    }
}