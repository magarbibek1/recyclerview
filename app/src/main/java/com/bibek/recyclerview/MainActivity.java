package com.bibek.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        List<contacts>contactsList=new ArrayList<>();
        contactsList.add(new contacts("Shyam","984457123",R.drawable.a));
        contactsList.add(new contacts("Ram","984457123",R.drawable.b));
        contactsList.add(new contacts("Hari","984457123",R.drawable.c));

        contactsAdapter contactsAdapter = new contactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
