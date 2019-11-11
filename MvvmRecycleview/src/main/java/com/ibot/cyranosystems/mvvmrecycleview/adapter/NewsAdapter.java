package com.ibot.cyranosystems.mvvmrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.ibot.cyranosystems.mvvmrecycleview.R;
import com.ibot.cyranosystems.mvvmrecycleview.databinding.ListRowBinding;
import com.ibot.cyranosystems.mvvmrecycleview.viewmodel.NewsModel;

import java.util.ArrayList;

/**
 * Created by innobot-linux-7 on 11/11/19,11,cleanArchitectureWitMvvm.
 */
public class NewsAdapter extends ArrayAdapter<NewsModel> {
    ArrayList<NewsModel> newsModelArrayList;
    Context context;
    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.list_row,newsModelArrayList);
        this.newsModelArrayList=newsModelArrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ListRowBinding listRowBinding=DataBindingUtil.inflate(layoutInflater,R.layout.list_row,parent,false);
        listRowBinding.setNewslist(newsModelArrayList.get(position));
        return listRowBinding.getRoot();
    }
}
