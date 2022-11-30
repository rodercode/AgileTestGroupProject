package com.example.agiletestgroupproject;

import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class SnakeBody {

    private ArrayList<Rectangle> snakeBody;
    private SnakeHead snakePart;

    public SnakeBody(List<SnakeHead> snakeBody) {
        this.snakeBody = new ArrayList<>();
    }

    public void addBody(){
        snakeBody.add(snakePart.getRectangle());
    }
}
