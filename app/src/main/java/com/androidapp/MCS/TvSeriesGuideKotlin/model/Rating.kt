package com.androidapp.MCS.TvSeriesGuideKotlin.model

import com.google.gson.annotations.SerializedName

class Rating (
    @SerializedName("Value")val value:String,
    @SerializedName("Source")val source:String){

}