package com.ibot.cyranosystems.kotlinfirstapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.ibot.cyranosystems.kotlinfirstapp.R
import com.ibot.cyranosystems.kotlinfirstapp.model.News

/**
 * Created by innobot-linux-7 on 13/11/19,13,cleanArchitectureWitMvvm.
 */
class CustomAdapter(context:Context,newslist:ArrayList<News>) : BaseAdapter() {


    private var newsList: ArrayList<News>
    private var layoutInflater: LayoutInflater
    init {
        this.newsList=newslist
        this.layoutInflater= LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(position: Int): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun getItemId(p0: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int{
        return newsList.size
    }

    class ViewHolder(view:View){
       var title: TextView
        var desc:TextView
        init{
            this.title=view.findViewById(R.id.txtTitle)
            this.desc=view.findViewById(R.id.txtDesc)
        }
    }
}