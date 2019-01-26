package com.androidapp.MCS.TvSeriesGuideKotlin.model

import com.google.gson.annotations.SerializedName


    data class Episode (

        @SerializedName("Title") val title:String,
        @SerializedName("Season") val season:String,
        @SerializedName("totalSeasons") val totalSeasons:String,
        @SerializedName("Episodes") val episodes:List<EpisodeResponse>,
        @SerializedName("Response") val response:String){

    }
