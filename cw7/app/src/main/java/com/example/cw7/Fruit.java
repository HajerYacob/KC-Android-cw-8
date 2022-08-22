package com.example.cw7;

import java.io.Serializable;

public class Fruit  implements Serializable {

    private String fruitName ;
    private String fruitColor ;
    private int Fruitimage;


    public Fruit(String fruitName, String fruitColor, int  Fruitimage) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.Fruitimage = Fruitimage;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public int getFruitimage() {
        return Fruitimage;
    }

    public void setFruitimage(int fruitimage) {
        this.Fruitimage= fruitimage;
    }
}
