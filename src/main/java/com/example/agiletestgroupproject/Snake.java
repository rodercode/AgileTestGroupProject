package com.example.agiletestgroupproject;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Snake extends Application {

    private int direction = 0; // 0 = left, 1 = right, 2 = up, 3 = down

    //Lost variable
    private Boolean lost = false;

    static List<Rectangle> snake = new ArrayList<>();
    @Override
    public void start(Stage stage) throws IOException {



        // Variable
        final int HEIGHT = 720;
        final int WIDE = 1280;

        //Objects
         SnakeHead snakeHead = new SnakeHead(HEIGHT/2,WIDE/2);
         Apple apple =new Apple();
         apple.generateApple(HEIGHT,WIDE, snakeHead);

        // add start snake parts
        snake.add(snakeHead.getRectangle());

        // add all the objects to draw to this group
        Group groupOfNodes = new Group();
        groupOfNodes.getChildren().add(snakeHead.getRectangle());
        groupOfNodes.getChildren().add(apple.getRectangle());

        //Text
        Text text = new Text();
        text.setText("You lost!");
        text.setX(WIDE/2);
        text.setY(HEIGHT/2);
        Group lostGroup = new Group(text);

        //Lost scene
        Scene lostScene = new Scene(lostGroup, WIDE, HEIGHT);
        lostScene.setFill(Color.BLACK);


        // Scene at 1280x720 pixels
        Scene scene = new Scene(groupOfNodes, WIDE, HEIGHT);
        scene.setFill(Color.BLACK);

        // Make the screen record key press
        scene = sceneSetKeyPress(scene);

        // Create a Window
        stage.setTitle("Snake!");
        stage.setScene(scene);
        stage.show();


        // Timeline is the runs every 0.2 seconds
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.2), ev -> {
            if(lost)
            {
                System.out.println("You Lost");
                stage.setScene(lostScene);
            }
            else
            {
                snakeHead.setSnakeMovement(direction, HEIGHT, WIDE);

                if (snakeHead.hitItself())
                {
                    lost = true;
                }

                if (snakeHead.getPosX() == apple.getPosX() && snakeHead.getPosY() == apple.getPosY())
                {
                    apple.generateApple(HEIGHT, WIDE, snakeHead);
                    snakeHead.growMe();
                }
            }
        }));
        // Runs the timeline forever
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public static void main(String[] args) {
        launch();
    }
    public Scene sceneSetKeyPress(Scene scene) {
        //Records the key press
        scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            if (key.getCode() == KeyCode.LEFT) {
                direction = 0;
            } else if (key.getCode() == KeyCode.RIGHT) {
                direction = 1;
            } else if (key.getCode() == KeyCode.UP) {
                direction = 2;
            } else if (key.getCode() == KeyCode.DOWN) {
                direction = 3;
            }
        });

        return scene;
    }

}