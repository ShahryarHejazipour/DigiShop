package com.tispunshahryar960103.digishop.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Product(

    @SerializedName("brand")
    @Expose
    val brand: String,
    @SerializedName("catId")
    @Expose
    val catId: String,
    @SerializedName("catName")
    @Expose
    val catName: String,
    @SerializedName("count")
    @Expose
    val count: String,
    @SerializedName("discount")
    @Expose
    val discount: String,
    @SerializedName("fullDescription")
    @Expose
    val fullDescription: String,
    @SerializedName("gallery")
    @Expose
    val gallery: List<Gallery>,
    @SerializedName("garanti")
    @Expose
    val garanti: String,
    @SerializedName("icon")
    @Expose
    val icon: String,
    @SerializedName("id")
    @Expose
    val id: String,
    @SerializedName("price")
    @Expose
    val price: String,
    @SerializedName("rate")
    @Expose
    val rate: String,
    @SerializedName("shortDescription")
    @Expose
    val shortDescription: String,
    @SerializedName("special")
    @Expose
    val special: String,
    @SerializedName("title")
    @Expose
    val title: String
)