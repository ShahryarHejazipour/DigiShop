package com.tispunshahryar960103.digishop.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Gallery(
    @SerializedName("img")
    @Expose
    val img: String
)