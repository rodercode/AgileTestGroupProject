package com.example.agiletestgroupproject;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class SnakeHead {
    private double  posX;
    private double posY;
    private final double snakeSize = 40;
    private Rectangle rectangle;

    // list of snack parts
    private List<SnakeBody> snake;

    private final int speed = 40;

    private int direction;

    public SnakeHead(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
        rectangle = new Rectangle(this.posX,this.posY,snakeSize,snakeSize);
        rectangle.setFill(Color.GREEN);
        snake = new ArrayList<>();
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
    // add snake bodies to snake list
    public void addSnake(SnakeBody snakeBody){
        snake.add(snakeBody);
    }

    public void setSnakeMovement(int direction){
        if(direction == 0 && this.direction != 1)
        {
            this.direction = 0;
        }
        else if(direction == 1 && this.direction != 0)
        {
            this.direction = 1;
        }
        else if(direction == 2 && this.direction != 3)
        {
            this.direction = 2;
        }
        else if(direction == 3 && this.direction != 2){

            this.direction = 3;
        }

        moveSnakeInDirection();
    }

    private void moveSnakeInDirection(){
        if (direction == 0)
        {
            posX -= speed;
        }
        else if (direction == 1) {
            posX += speed;
        }
        else if (direction == 2) {
            posY -= speed;
        }
        else if (direction == 3) {
            posY += speed;

        }
        rectangle.setX(posX);
        rectangle.setY(posY);
    }
}
