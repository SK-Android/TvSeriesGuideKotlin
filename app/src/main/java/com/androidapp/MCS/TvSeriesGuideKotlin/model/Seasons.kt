package com.androidapp.MCS.TvSeriesGuideKotlin.model

import java.util.*


data class Seasons( var itemId:String) {
   init {
       itemId = randomUUID()
   }


fun randomUUID():String{
    return UUID.randomUUID().toString();
}


}