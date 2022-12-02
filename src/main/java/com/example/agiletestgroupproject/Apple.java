package com.example.agiletestgroupproject;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Apple {
    Random r = new Random();
    private double posX;
    private double posY;
    private Rectangle rectangle;
    private final double apelSize = 40;

    public Apple() {
        rectangle = new Rectangle(0, 0, apelSize, apelSize);
        rectangle.setFill(Color.RED);
    }

    public void generateApple(int Height, int Wide) {
        rectangle.setY(40 * r.nextInt(Height / 40));
        rectangle.setX(40 * r.nextInt(Wide / 40));
    }

//    public boolean eatApple(Apple apple){
//        if ()
//            return true;
//
//    }

    public Random getR() {
        return r;
    }

    public double getPosX() {
        return posX;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public double getPosY() {
        return posY;
    }

    public double getApelSize() {
        return apelSize;
    }
}
