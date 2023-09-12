package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<Item> items = new ArrayList<Item>();



        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.alo));
        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.ba));
        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.download));
        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.ba));
        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.download));
        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.ba));
        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.download));
        items.add(new Item("Sách Tài Chính Cá Nhân","tặng kèm tất cả những nội dung về tài chính cá nhân",R.drawable.ba));

        RecyclerView recyclerView =findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),items));
    }
}