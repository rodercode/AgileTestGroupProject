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

    private int direction; // 0 = left, 1 = right, 2 = up, 3 = down

    public SnakeHead(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
        rectangle = new Rectangle(this.posX,this.posY,snakeSize,snakeSize);
        rectangle.setFill(Color.GREEN);
        snake = new ArrayList<>();
    }

    public Boolean hitItself(){
        for (SnakeBody snakeBody: snake)
        {
            if(this.posX == snakeBody.getPosX() && this.posY == snakeBody.getPosY())
            {
                return true;
            }
        }
        return false;
    }

    public void growMe(){
        // If snake is empty just add a new snakeBody with the heads position
        if (snake.isEmpty())
        {
            snake.add(new SnakeBody(posX, posY));
        }
        // Else add a new SnakeBody with the last bodies position
        else
        {
            int lastIndex = snake.size() - 1;
            snake.add(new SnakeBody(snake.get(lastIndex).getPosX(), snake.get(lastIndex).getPosY()));
        }

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

    public void setSnakeMovement(int direction, int height, int wide){
        // 0 = left, 1 = right, 2 = up, 3 = down
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

        moveSnakeInDirection(height, wide);
    }

    private void moveSnakeInDirection(int height, int wide){
        moveSnakeBody();

        // 0 = left, 1 = right, 2 = up, 3 = down
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

        if (posX >= wide)
        {
            posX = 0;
        }
        else if (posX < 0 )
        {
            posX = wide - snakeSize;
        } else if (posY >= height) {
            posY = 0;
        } else if (posY < 0) {
            posY = height - snakeSize;

        }
        rectangle.setX(posX);
        rectangle.setY(posY);
    }

    private void moveSnakeBody()
    {
        if (snake.isEmpty())
        {

        }
        else
        {
            // Loops through all snakeBody except index 0 and sets position to the previous one
            for (int index = snake.size() - 1; index > 0; index--)
            {
                snake.get(index).setPosX(snake.get(index-1).getPosX());
                snake.get(index).setPosY(snake.get(index-1).getPosY());
            }
            snake.get(0).setPosX(posX);
            snake.get(0).setPosY(posY);
        }
    }

    public Rectangle getLatestSnakeBody() {
        // Get rectangle of last snakeBody in snake
        Rectangle rectangle = snake.get(snake.size() - 1).getRectangle();
        return rectangle;
    }
}
