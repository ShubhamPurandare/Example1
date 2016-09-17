package com.example.root.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.root.example.Book;
import com.example.root.example.R;

import java.util.ArrayList;

/**
 * Created by root on 17/9/16.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    private Context mContext;
    private int mResource;
    private  ArrayList<Book> mObjects;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        BookViewHolder bookViewHolder;

        if(convertView== null){

            convertView = LayoutInflater.from(mContext).inflate(R.layout.custom,null);

            bookViewHolder = new BookViewHolder();

            bookViewHolder.tvEdition = (TextView) convertView.findViewById(R.id.textView);
            bookViewHolder.tvName = (TextView) convertView.findViewById(R.id.textView2);
            bookViewHolder.tvPrice = (TextView) convertView.findViewById(R.id.textView3);

            convertView.setTag(bookViewHolder);


        }else {

            bookViewHolder = (BookViewHolder) convertView.getTag();



        }


        Book book = mObjects.get(position);
        bookViewHolder.tvName.setText(book.getBook_name());
        bookViewHolder.tvEdition.setText(book.getEdition());
        bookViewHolder.tvPrice.setText(book.getPriice());

        return  convertView;




    }

    public BookAdapter(Context context, int resource, ArrayList<Book> objects) {
        super(context, resource, objects);

        mContext = context;
        mObjects = objects;
        mResource = resource;






    }




    public  class BookViewHolder{

         public TextView tvName,tvEdition, tvPrice;



    }
}
