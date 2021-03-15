package com.example.demo.services;


import com.example.demo.models.GalleryImage;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

public class ImageManager {

    private ArrayList<GalleryImage> images;
    private File f;
    private String[] pathNames;

    public ImageManager(){
        images = new ArrayList<>();
        f = new File("src/main/resources/static/imagesForGallery");
        pathNames = f.list();
        addImagesToList();
    }

    public ArrayList<GalleryImage> getImages(){
        return this.images;
    }

    public void addImagesToList(){
        for (String path:pathNames){
            GalleryImage tmp = new GalleryImage("Picture","imagesForGallery/"+path);
            images.add(tmp);
        }
    }
}
