package com.daotrung.bai1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyViewHolder> {
    public List<Food> foodList;
    public Context mContext;

    public FoodAdapter(Context mContext) {
        this.mContext = mContext;

    }
    public void setData(List<Food> list){
             this.foodList = list;
             notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dong,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
          Food food = foodList.get(position);
          if(food == null){
              return;
          }
          holder.txtNhom.setText(food.getNhom());
          holder.txtFan.setText(food.getFan());
          holder.txtBaiViet.setText(food.getBaiViet());
          holder.txtName.setText(food.getName());
          holder.imgFood.setImageResource(food.getHinh());
    }

    @Override
    public int getItemCount() {
        if(foodList != null){
            return foodList.size();
        }
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgFood ;
        TextView txtName , txtFan ,txtBaiViet,txtNhom ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            txtName = itemView.findViewById(R.id.txtName);
            txtFan = itemView.findViewById(R.id.txtFan);
            txtBaiViet = itemView.findViewById(R.id.txtBaiViet);
            txtNhom = itemView.findViewById(R.id.txtNhom);
        }
    }
}
