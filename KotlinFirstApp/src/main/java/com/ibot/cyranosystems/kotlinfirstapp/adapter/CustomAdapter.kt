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
        var view :View
        var viewholder:ViewHolder
        if(convertview==null){
            view=this.layoutInflater.inflate(R.layout.inner_layout,parent,false)
            viewholder =ViewHolder(view)
            view.tag=viewholder
        }else{
            view=convertview
            viewholder=view.tag as ViewHolder
        }
        viewholder.title.text=newsList[position].title
        viewholder.desc.text=newsList[position].desc
        return view
    }

    override fun getItem(position: Int): Any? {
        return newsList[position]
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
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