package com.example.celina.wallet;

import com.orm.SugarRecord;

/**
 * Created by celina on 20.07.2017.
 */

public class Book extends SugarRecord<Book> {
    String title;
    String edition;

    public Book(){
    }

    public Book(String title, String edition){
        this.title = title;
        this.edition = edition;
    }
}