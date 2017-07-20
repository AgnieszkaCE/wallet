package com.example.celina.wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView text_cosik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Dodanie do bazy nowego elementu
        Book setBook = new Book("Aga", "2nd edition");
        setBook.save();

        text_cosik = (TextView) findViewById(R.id.text_cosik);

//        Pobranie pierwszego elementu
//        Book getBook = Book.findById(Book.class, (long) 1);

//        Lista dostepnych Book
        List<Book> books = Book.listAll(Book.class);

//        Przeslanie pierwszego tytulu do widoku aplikacji jako text
        text_cosik.setText(books.get(1).title);

//        Usuniecie wszystkich elementow
        Book.deleteAll(Book.class);
    }
}
