package com.example.agiletestgroupproject;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Apple {
    Random random = new Random();
    private double posX;
    private double posY;
    private Rectangle rectangle;
    private final double apelSize = 40;

    public Apple() {
        rectangle = new Rectangle(0, 0, apelSize, apelSize);
        rectangle.setFill(Color.RED);
    }

    public void generateApple(int Height, int Wide, SnakeHead snakeHead) {
        int posY = 40 * random.nextInt(Height / 40);
        int posX = 40 * random.nextInt(Wide / 40);
        while (snakeHead.isOnPosition(posX, posY))
        {
            posY = 40 * random.nextInt(Height / 40);
            posX = 40 * random.nextInt(Wide / 40);
        }
        this.posX = posX;
        this.posY = posY;
        rectangle.setX(this.posX);
        rectangle.setY(this.posY);
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

}
