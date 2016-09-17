package com.example.root.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    BookAdapter bookAdapter;


     ArrayList<Book> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);


        arrayList = new ArrayList<Book>();

        for (int i = 0; i < 16 ; i++ )
        arrayList.add(new Book("Book" +i , "Edition "+i , "Price "+i));
        bookAdapter = new BookAdapter(MainActivity.this,R.layout.custom,arrayList);

        listView.setAdapter(bookAdapter);





    }
}
