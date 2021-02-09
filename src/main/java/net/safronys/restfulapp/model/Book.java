package net.safronys.restfulapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "books")
public class Book extends BaseEntity{

    @Column(name = "name_book")
    private String nameBook;

    @Column(name = "author")
    private String author;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
