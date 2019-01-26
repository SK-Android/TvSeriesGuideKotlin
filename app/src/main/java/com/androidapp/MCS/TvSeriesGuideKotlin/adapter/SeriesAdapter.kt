package com.androidapp.MCS.TvSeriesGuideKotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.androidapp.MCS.TvSeriesGuideKotlin.R
import com.androidapp.MCS.TvSeriesGuideKotlin.model.Series
import com.squareup.picasso.Picasso

class SeriesAdapter(val search:List<Series>) : RecyclerView.Adapter<SeriesAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SeriesAdapter.ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.main_list_item,p0,false)
    return ViewHolder(view)
    }

    override fun getItemCount(): Int {
    return search.size
    }

    override fun onBindViewHolder(p0: SeriesAdapter.ViewHolder, p1: Int) {
        p0.seriesTitle.setText(search[p1].title)
        Picasso.get().load(search[p1].poster).fit().placeholder(R.drawable.ic_launcher_background)
            .into(p0.seriesThumbnail)
        ///p0.seriesThumbnail.setOnClickListener {  }()
     }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val seriesThumbnail: ImageView
        val seriesTitle: TextView
        val overflow: ImageView
        init {
            this.seriesThumbnail = itemView.findViewById(R.id.series_thumbnail)
            this.seriesTitle = itemView.findViewById(R.id.seriestitle)
            this.overflow = itemView.findViewById(R.id.overflow)
        }

    }

}