package com.example.recyclerviewpr;

public class Model {
    private int img;
    private String name;

    public Model(int img, String name){
        this.img = img;
        this.name = name;
    }

    public int getImg(){ return img; }

    public String getName(){ return name; }
}
