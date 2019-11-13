package com.ibot.cyranosystems.mvvmrecycleview.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibot.cyranosystems.mvvmrecycleview.databinding.NewsBinding;
import com.ibot.cyranosystems.mvvmrecycleview.viewmodel.NewsModel;

import java.util.List;

/**
 * Created by innobot-linux-7 on 12/11/19,12,cleanArchitectureWitMvvm.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {

   // List<News> newsList;
    List<NewsModel> newsList;
    private LayoutInflater layoutInflater;
//    public CustomAdapter(List<News> newsList) {
//        this.newsList=newsList;
//    }
    public CustomAdapter(List<NewsModel> newsList) {
        this.newsList=newsList;
    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.inner_layout,parent,false);
//        return new CustomView(view);
        if(layoutInflater==null){
            layoutInflater=LayoutInflater.from(parent.getContext());
        }
        NewsBinding newsBinding=NewsBinding.inflate(layoutInflater,parent,false);
        return new CustomView(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView holder, int position) {
//        News news=newsList.get(position);
//        holder.title.setText(news.getTitle());
//        holder.desc.setText(news.getDesc());
        NewsModel newsModel=newsList.get(position);
        holder.bind(newsModel);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class CustomView extends RecyclerView.ViewHolder{
        //Normal way
       /* TextView title,desc;
       * public CustomView(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.txtTitleValue);
            desc=itemView.findViewById(R.id.txtDescValue);
        }*/
        private NewsBinding newsBinding;
        public CustomView(@NonNull NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            this.newsBinding=newsBinding;
        }
        public void bind(NewsModel newsModel){
            this.newsBinding.setNewsview(newsModel);
        }
        public NewsBinding getNewsBinding(){
            return newsBinding;
        }
    }

}
