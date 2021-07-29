package com.example.apiappdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.squareup.picasso.Picasso;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ClassViewHolder> {

    private ArrayList<Trns> dataList;
    private Context context;

    public ClassAdapter(ArrayList<Trns> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClassViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
        holder.name.setText("Name : "+dataList.get(position).getName());
        holder.slug.setText("Slug : "+dataList.get(position).getSlug());
        holder.status.setText("Status : "+dataList.get(position).getStatus());

        Picasso.get().load(dataList.get(position).getImg()).into(holder.img);

        //ImageUtils.fetchSvg(context,dataList.get(position).getImg(),holder.img);



    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ClassViewHolder extends RecyclerView.ViewHolder {
        public TextView name, slug, status;
        public ImageView img;

        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_txt);
            slug = itemView.findViewById(R.id.slug_txt);
            status = itemView.findViewById(R.id.sts_txt);
            img = itemView.findViewById(R.id.flag_img);


        }
    }
}
