package com.example.agiletestgroupproject;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class SnakeBody {

    private double  posX;
    private double posY;
    private final double snakeSize = 40;
    private Rectangle rectangle;


    public SnakeBody(double posX,double posY) {
        this.posX = posX;
        this.posY = posY;
        rectangle = new Rectangle(this.posX,this.posY,snakeSize,snakeSize);
        rectangle.setFill(Color.GREEN);
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
