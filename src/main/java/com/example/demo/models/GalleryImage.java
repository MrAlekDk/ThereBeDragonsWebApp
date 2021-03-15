package com.example.demo.models;

public class GalleryImage {

    public String discription;
    public String url;
    private static int id =1;

    public GalleryImage(String discription, String url) {
        this.discription = discription;
        this.url = url;
        id++;
    }
}
