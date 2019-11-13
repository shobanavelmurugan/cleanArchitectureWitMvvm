package com.ibot.cyranosystems.mvvmrecycleview.viewmodel;

import com.ibot.cyranosystems.mvvmrecycleview.model.News;

/**
 * Created by innobot-linux-7 on 12/11/19,12,cleanArchitectureWitMvvm.
 */
public class NewsModel {
    public String title,desc;

    public NewsModel(News news) {
        this.title=news.Title;
        this.desc=news.Desc;
    }

    public NewsModel() {
    }
}
