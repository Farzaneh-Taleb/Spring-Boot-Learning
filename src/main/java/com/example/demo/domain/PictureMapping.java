package com.example.demo.domain;


import javax.persistence.*;

@Entity
public class PictureMapping {
    private int id ;
    private String pictureURL ;
    private String text ;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="TEXT")
    @Lob
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Column(name="TEXT")
    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }


}
