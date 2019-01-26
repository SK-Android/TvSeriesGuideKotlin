package com.androidapp.MCS.TvSeriesGuideKotlin.model

import com.google.gson.annotations.SerializedName

data class Search (
    @SerializedName("imdbID") val imdbID:String,
    @SerializedName("Title") val title:String,
    @SerializedName("Year") val year:String,
    @SerializedName("Type") val type:String,
    @SerializedName("Poster") val poster:String){

}