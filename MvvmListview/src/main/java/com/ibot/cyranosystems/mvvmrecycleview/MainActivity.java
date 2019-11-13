package com.ibot.cyranosystems.mvvmrecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.ibot.cyranosystems.mvvmrecycleview.adapter.NewsAdapter;
import com.ibot.cyranosystems.mvvmrecycleview.databinding.ActivityMainBinding;
import com.ibot.cyranosystems.mvvmrecycleview.viewmodel.NewsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NewsModel newsModel;
    private ActivityMainBinding activityMainBinding;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        newsModel=new NewsModel();
        newsModelArrayList=newsModel.getArrayListNews();
        newsAdapter=new NewsAdapter(this,newsModelArrayList);
        activityMainBinding.listview.setAdapter(newsAdapter);
    }
}
