package com.ibot.cyranosystems.kotlinfirstapp.model

/**
 * Created by innobot-linux-7 on 13/11/19,13,cleanArchitectureWitMvvm.
 */
class News {
    var title:String?=null
    var desc:String?=null

    constructor(title: String?, desc: String?) {
        this.title = title
        this.desc = desc
    }
}