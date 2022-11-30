package com.example.agiletestgroupproject;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SnakeHead {
    private double  posX;
    private double posY;
    private final double snakeSize = 40;
    private Rectangle rectangle;

    private int direction;


    public SnakeHead(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
        rectangle = new Rectangle(this.posX,this.posY,snakeSize,snakeSize);
        rectangle.setFill(Color.GREEN);
    }


    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getSnakeSize() {
        return snakeSize;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void moveSnake(int direction){
        if(this.direction == direction)
        {

        }
    }

    private void moveSnakeInDirection(){

    }
}
