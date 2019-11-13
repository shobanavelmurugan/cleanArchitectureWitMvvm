package com.ibot.cyranosystems.mvvmrecycleview.model;

/**
 * Created by innobot-linux-7 on 12/11/19,12,cleanArchitectureWitMvvm.
 */
public class News {
    public String Title,Desc;

    public News(String title, String desc) {
        Title=title;
        Desc=desc;
    }

    public News() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title=title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc=desc;
    }
}
