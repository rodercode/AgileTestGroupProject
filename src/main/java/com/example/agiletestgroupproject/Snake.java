package com.example.agiletestgroupproject;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Snake extends Application {

    private static int direction = 0; // 0 = left, 1 = right, 2 = up, 3 = down

    static List<Rectangle> snake = new ArrayList<>();
    @Override
    public void start(Stage stage) throws IOException {

        // Variable
        final int HEIGHT = 1280;
        final int WIDE = 720;

        //Objects
        SnakeHead snakeHead = new SnakeHead(HEIGHT/2,WIDE/2);
        SnakeHead snakeHead1 = new SnakeHead(HEIGHT/2,WIDE/2);

        // add start snake parts
        snake.add(snakeHead.getRectangle());

        // add all the objects to draw to this group
        Group groupOfNodes = new Group();
        groupOfNodes.getChildren().addAll(snake);

        // Scene at 1280x720 pixels
        Scene scene = new Scene(groupOfNodes, HEIGHT, WIDE);

        // Make the screen record key press
        scene = sceneSetKeyPress(scene);

        // Create a Window
        scene.setFill(Color.BLACK);
        stage.setTitle("Snake!");
        stage.setScene(scene);
        stage.show();

        // Timeline is the runs every 0.2 seconds
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.2), ev -> {
            snakeHead.setSnakeMovement(direction);
        }));
        // Runs the timeline forever
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public static void main(String[] args) {
        launch();
    }
    public static Scene sceneSetKeyPress(Scene scene) {
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