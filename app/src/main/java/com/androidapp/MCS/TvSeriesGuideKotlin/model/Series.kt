package com.androidapp.MCS.TvSeriesGuideKotlin.model

import com.google.gson.annotations.SerializedName

data class Series (
@SerializedName("imdbID") val imdbID:String,
@SerializedName("Title") val title:String,
@SerializedName("Year") val year:String,
@SerializedName("Type") val type:String,
@SerializedName("Poster") val poster:String,
@SerializedName("totalResults") val totalResults:String,
@SerializedName("Response") val response:String,
@SerializedName("Search") val search:List<Series>){

}