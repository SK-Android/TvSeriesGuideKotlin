package com.androidapp.MCS.TvSeriesGuideKotlin.service

import com.androidapp.MCS.TvSeriesGuideKotlin.model.Details
import com.androidapp.MCS.TvSeriesGuideKotlin.model.Episode
import com.androidapp.MCS.TvSeriesGuideKotlin.model.Series
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface IMDBApi {

    //Call to get a list of series
    @GET("?apikey=2b0cf4b2&s=game&type=series")
    fun getSeriesObservable(): Observable<Series>

    @GET("?apikey=2b0cf4b2")
    fun getEpisodes(
        @Query("i") id: String, @Query("season") season: String): Call<Episode>

    //www.omdbapi.com/?apikey=2b0cf4b2&i=tt0944947&i=tt0944947&season=1


    @GET("?apikey=2b0cf4b2")
    abstract fun getDetails(
        @Query("i") id: String, @Query("season") season: String, @Query("episode") episode: String): Call<Details>
    //http://www.omdbapi.com/?apikey=2b0cf4b2&i=tt0944947&i=tt0944947&season=1&episode=1
}
