package com.androidapp.MCS.TvSeriesGuideKotlin

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.androidapp.MCS.TvSeriesGuideKotlin.DetailsActivity.Companion.MY_GLOBAL_PREFS
import com.androidapp.MCS.TvSeriesGuideKotlin.adapter.SeasonAdapter

import com.androidapp.MCS.TvSeriesGuideKotlin.adapter.SeriesAdapter
import com.androidapp.MCS.TvSeriesGuideKotlin.adapter.SeriesAdapter.Companion.IMDBID
import com.androidapp.MCS.TvSeriesGuideKotlin.adapter.SeriesAdapter.Companion.TITLEID
import com.androidapp.MCS.TvSeriesGuideKotlin.model.Episode
import com.androidapp.MCS.TvSeriesGuideKotlin.model.SeasonData

class SeasonActivity : AppCompatActivity() {
    private val TAG = "season_activity"
    var FLAG = 0
    val SEASONID = "season_key"
    val SERIESID = "series_key"
    private val SEASON_KEY = 1001

     var episode: Episode? = null
     var seasonNo = "1"
     var imdbID: String? = null

     var seasonList = SeasonData.seasonsList
    lateinit var seriesTitle: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_season)

        if (FLAG == 0) {
            val intent = intent         //Java-> Intent intent = getIntent();
            if (intent != null) {
                imdbID = intent.getStringExtra(IMDBID)
                seriesTitle = intent.getStringExtra(TITLEID)
                Toast.makeText(this, "" + seriesTitle, Toast.LENGTH_SHORT).show()
            } else
                Toast.makeText(this, "Didn't receive data", Toast.LENGTH_SHORT).show()
        } else {
            val editor =
                getSharedPreferences(MY_GLOBAL_PREFS, Context.MODE_PRIVATE).edit()  //Always select MODE_PRIVATE
            editor.putString(
                SeriesAdapter.TITLEID,
                seriesTitle
            )                                          // but haven't commited or applied  changes
            editor.apply()
        }

        val textView = findViewById<TextView>(R.id.serieTitle)
        textView.text = seriesTitle



        val adapter = SeasonAdapter(this, seasonList)
        val listView = findViewById<ListView>(R.id.seasonListView)
        listView.setAdapter(adapter)
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            //Toast.makeText(SeasonActivity.this, "You Selected", Toast.LENGTH_SHORT).show();
            //***********************
            FLAG = 1
            val seasonNo = adapter.getItem(position).itemId
            val intent1 = Intent(this@SeasonActivity, EpisodeActivity::class.java)
            intent1.putExtra(SERIESID, imdbID)
            intent1.putExtra(SEASONID, seasonNo)
            Toast.makeText(this@SeasonActivity, "You selected\tSeason: $seasonNo\tof\t$seriesTitle", Toast.LENGTH_LONG)
                .show()
            this@SeasonActivity.startActivityForResult(intent1, SEASON_KEY)
        }

    }

//
//
//    override fun onBackPressed() {
//        val editor = getSharedPreferences(MY_GLOBAL_PREFS, Context.MODE_PRIVATE).edit()  //Always select MODE_PRIVATE
//        //warning is displayed because I specified .edit()
//        editor.putString(
//            DetailsFragment.IMDB_KEY,
//            imdbID
//        )                                          // but haven't commited or applied  changes
//        editor.putString(DetailsFragment.SEASON_KEY, seasonNo)
//        editor.apply()
//        super.onBackPressed()
//    }
//
//    override fun onDestroy() {
//        AppDatabase.destroyInstance()
//        super.onDestroy()
//    }

}
