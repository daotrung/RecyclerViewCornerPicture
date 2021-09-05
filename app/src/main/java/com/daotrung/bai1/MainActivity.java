package com.daotrung.bai1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvFood ;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rvFood);
//        arrayList = new ArrayList<>();
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
//        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","Nhóm đóng",R.drawable.image1));
        foodAdapter = new FoodAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvFood.setLayoutManager(linearLayoutManager);
        foodAdapter.setData(getListUser());
        rvFood.setAdapter(foodAdapter);
    }
    private List<Food> getListUser(){
        List<Food> arrayList = new ArrayList<>();

        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.food2));
        arrayList.add(new Food("No one is more adorable than Baby Yoda","10K Fan ","+12 bài viết mới nhất","NHÓM MỞ",R.drawable.yoda_baby));
        arrayList.add(new Food("Đặc sản miền đất hứa","2K Fan ","+11 bài viết mới nhất","NHÓM MỞ",R.drawable.food));
        arrayList.add(new Food("Bánh mỳ sốt vang","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.food2));
        arrayList.add(new Food("Phở sốt vang","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.food3));
        arrayList.add(new Food("Tour du lịc bên bờ sông Hương","20K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.food));
        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.car_2));
        arrayList.add(new Food("Mì gà tần","8K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.food6));
        arrayList.add(new Food("Siêu xe mới xuất hiện đầy đường phố","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.car_2));
        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.food3));
        arrayList.add(new Food("No one is more adorable than Baby Yoda","10K Fan ","+12 bài viết mới nhất","NHÓM MỞ",R.drawable.yoda_baby));
        arrayList.add(new Food("Đặc sản miền đất hứa","2K Fan ","+11 bài viết mới nhất","NHÓM MỞ",R.drawable.food));
        arrayList.add(new Food("Bánh mỳ sốt vang","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.food2));
        arrayList.add(new Food("Phở sốt vang","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.food3));
        arrayList.add(new Food("Tour du lịc bên bờ sông Hương","20K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.food));
        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.car_2));
        arrayList.add(new Food("Mì gà tần","8K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.food6));
        arrayList.add(new Food("Siêu xe mới xuất hiện đầy đường phố","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.car_2));

        return arrayList;
    }
}