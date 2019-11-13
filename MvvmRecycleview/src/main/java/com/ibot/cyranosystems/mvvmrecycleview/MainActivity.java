 package com.ibot.cyranosystems.mvvmrecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ibot.cyranosystems.mvvmrecycleview.adapter.CustomAdapter;
import com.ibot.cyranosystems.mvvmrecycleview.viewmodel.NewsModel;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;
    //private List<News> newsList;
     private List<NewsModel> newsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsList=new ArrayList<>();
        customAdapter=new CustomAdapter(newsList);
        recyclerView.setAdapter(customAdapter);
        setData();
    }

     private void setData() {
//        News news1=new News("Title1","This is title one");
//        News news2=new News("Title2","This is title two");
//        News news3=new News("Title3","This is title three");
//        News news4=new News("Title4","This is title four");
//        News news5=new News("Title5","This is title five");
//        newsList.add(news1);
//        newsList.add(news2);
//        newsList.add(news3);
//        newsList.add(news4);
//        newsList.add(news5);
         NewsModel newsModel=new NewsModel();
         newsModel.title="First Title";
         newsModel.desc="This is first Title";
         newsList.add(newsModel);
         NewsModel newsModel1=new NewsModel();
         newsModel1.title="Second Title";
         newsModel1.desc="This is Second Title";
         newsList.add(newsModel1);
     }
 }
