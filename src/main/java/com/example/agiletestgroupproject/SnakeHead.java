package com.example.agiletestgroupproject;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SnakeHead {
    private final double  posX = 1280/2;
    private final double posY = 720/2;
    private final double snakeSize = 40;
    private Rectangle rectangle;


    public SnakeHead() {
        rectangle = new Rectangle(posX,posY,snakeSize,snakeSize);
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
}
