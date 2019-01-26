package com.androidapp.MCS.TvSeriesGuideKotlin.model

import com.google.gson.annotations.SerializedName


    data class EpisodeResponse (
        @SerializedName("imdbID") val imdbID:String,
        @SerializedName("Title") val title:String,
        @SerializedName("Released") val released:String,
        @SerializedName("Episode") val episode:String,
        @SerializedName("imdbRating") val imdbRating:String){


    }
