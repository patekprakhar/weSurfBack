package com.example.finalWesurf.movieData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Document("movies")
public class movie {
    @Id
    private Long id;
    private String movieName;
    private Integer moviePrice;
    private String description;
    private Image img;
    private Image lImg;
    private Integer rentPrice;
    private Integer purchasePrice;
    private Boolean isFeatured;

    public movie(Long id, String movieName, Integer moviePrice, String description, Image img, Image lImg, Integer rentPrice, Integer purchasePrice, Boolean isFeatured) {
        this.id = id;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.description = description;
        this.img = img;
        this.lImg = lImg;
        this.rentPrice = rentPrice;
        this.purchasePrice = purchasePrice;
        this.isFeatured = isFeatured;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(Integer moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public Image getlImg() {
        return lImg;
    }

    public void setlImg(Image lImg) {
        this.lImg = lImg;
    }

    public Integer getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Integer rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Boolean getFeatured() {
        return isFeatured;
    }

    public void setFeatured(Boolean featured) {
        isFeatured = featured;
    }

    @Override
    public String toString() {
        return "movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", moviePrice=" + moviePrice +
                ", description='" + description + '\'' +
                ", img=" + img +
                ", lImg=" + lImg +
                ", rentPrice=" + rentPrice +
                ", purchasePrice=" + purchasePrice +
                ", isFeatured=" + isFeatured +
                '}';
    }
}
