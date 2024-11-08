package com.example.demo.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private LocalDate creationDate;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Post() {
    }

    public Post(String text) {
        this.text = text;
        this.likes = 0;
        this.creationDate = LocalDate.now();
    }

    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
        this.creationDate = LocalDate.now();
    }

    public Post(Long id, String text, LocalDate creationDate) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }


    public Post(Long id, String text) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = LocalDate.now();
    }
}
