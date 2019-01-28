package com.androidapp.MCS.TvSeriesGuideKotlin

import android.graphics.drawable.ClipDrawable.VERTICAL
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.*
import android.widget.GridLayout
import com.androidapp.MCS.TvSeriesGuideKotlin.adapter.SeriesAdapter
import com.androidapp.MCS.TvSeriesGuideKotlin.model.Search
import com.androidapp.MCS.TvSeriesGuideKotlin.model.Series
import com.androidapp.MCS.TvSeriesGuideKotlin.service.ApiClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_rv.layoutManager = GridLayoutManager(this, 2)
        val itemDecor = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        main_rv.addItemDecoration(itemDecor)


        val api = ApiClient().imdbApi
        api.getSeriesObservable()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(IoScheduler())
            .subscribe({
                setupAdapter(it)
            })

    }

    /**
     * When data is available provide it to the RecyclerVie
     * via RepoAdapter
     */
    private fun setupAdapter(series: Series?) {
        if (series != null) {
            val adapter = SeriesAdapter(series.search)
            main_rv.adapter = adapter
        }

    }
    }
