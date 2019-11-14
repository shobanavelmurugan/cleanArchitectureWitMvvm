package com.ibot.cyranosystems.kotlinfirstapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.ibot.cyranosystems.kotlinfirstapp.adapter.CustomAdapter
import com.ibot.cyranosystems.kotlinfirstapp.model.News

/**
 * Created by innobot-linux-7 on 13/11/19,13,cleanArchitectureWitMvvm.
 */
class SimpleListViewActivity : AppCompatActivity() {
    private var newslist = ArrayList<News>()
    var listview : ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_listview_activity)
        listview=findViewById(R.id.listview)
        newslist.add(News("Title one","Descriptio first"))
        newslist.add(News("Title two","Descriptio two"))
        newslist.add(News("Title three","Descriptio three"))
        newslist.add(News("Title four","Descriptio four"))
        newslist.add(News("Title five","Descriptio five"))
        var customAdapter=CustomAdapter(this,newslist)
        listview?.adapter=customAdapter
    }
}