package com.adamse.aslayouting2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.Map;

public class ListFigureAdapter  extends RecyclerView.Adapter<ListFigureAdapter.ListViewHolder> {
    private ArrayList<FigureList> listFigure;

    public ListFigureAdapter(ArrayList<FigureList> list) {
        this.listFigure = list;
    }
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hero, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        FigureList figure = listFigure.get(position);
        Glide.with(holder.itemView.getContext())
                .load(figure.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(figure.getName());
        holder.tvDetail.setText(figure.getDetail());
    }

     @Override
        public int getItemCount() {
            return listFigure.size();
        }

        class ListViewHolder extends RecyclerView.ViewHolder {
            ImageView imgPhoto;
            TextView tvName, tvDetail;
            ListViewHolder(View itemView) {
                super(itemView);
                imgPhoto = itemView.findViewById(R.id.img_item_photo);
                tvName = itemView.findViewById(R.id.tv_item_name);
                tvDetail = itemView.findViewById(R.id.tv_item_detail);
            }
        }
    }

