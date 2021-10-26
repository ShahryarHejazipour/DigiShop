package com.tispunshahryar960103.digishop.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseModel(
    @SerializedName("AmazingOffer")
    @Expose
    val AmazingOffer: List<Product>,
    @SerializedName("data")
    @Expose
    val data: Data,
    @SerializedName("discount")
    @Expose
    val discount: List<Product>,
    @SerializedName("makeup")
    @Expose
    val makeup: List<Product>,
    @SerializedName("mobile")
    @Expose
    val mobile: List<Product>,
    @SerializedName("news")
    @Expose
    val news: List<News>
)