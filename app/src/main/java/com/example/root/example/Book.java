package com.example.root.example;

/**
 * Created by root on 17/9/16.
 */
public class Book {


    public Book(String book_name, String edition, String priice) {
        Book_name = book_name;
        Edition = edition;
        Priice = priice;
    }

    private String Book_name,Edition,Priice;

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public String getPriice() {
        return Priice;
    }

    public void setPriice(String priice) {
        Priice = priice;
    }
}
