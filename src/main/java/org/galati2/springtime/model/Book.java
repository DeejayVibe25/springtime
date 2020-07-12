package org.galati2.springtime.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_id;
    private String title;
    private String subtitle;

    public int getBook_id() {
        return book_id;
    }

    public Book setBook_id(int book_id) {
        this.book_id = book_id;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Book setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public int getId() {
        return book_id;
    }

    public Book setId(int id) {
        this.book_id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String name) {
        this.title = name;
        return this;
    }
}
