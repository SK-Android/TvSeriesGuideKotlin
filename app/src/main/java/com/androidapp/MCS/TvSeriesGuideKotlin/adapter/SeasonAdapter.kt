package com.androidapp.MCS.TvSeriesGuideKotlin.adapter

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.androidapp.MCS.TvSeriesGuideKotlin.R
import com.androidapp.MCS.TvSeriesGuideKotlin.model.Seasons
import kotlinx.android.synthetic.main.season_list_item.view.*

class SeasonAdapter(val objects: List<Seasons>): ArrayList<Seasons>() {

//    init {
//        var mSeasons: List<Seasons> = objects
////        var mInflater: LayoutInflater = LayoutInflater.from(cont)
////
////    }
//
////    fun SeasonAdapter(context: Context, objects: List<Seasons>): ??? {
////        super(context, R.layout.season_list_item, objects)
////        mSeasons = objects
////        mInflater = LayoutInflater.from(context)
////    }
//
//    fun getView(position: Int, convertView1: View?, parent: ViewGroup): View {
//        //var mSeasons: List<Seasons> = objects
//        val mInflater: LayoutInflater = LayoutInflater.from(parent.context)
//        var convertView = convertView1
//        if (convertView == null) {
//            convertView = mInflater.inflate(R.layout.season_list_item, parent, false)
//        }
//        val textView = convertView!!.seasonNo
//        val seasons = objects[position]
//        textView.setText(seasons.itemId)
//        return convertView
//    }
}