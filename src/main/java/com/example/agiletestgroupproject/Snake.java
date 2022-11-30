package com.example.agiletestgroupproject;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Snake extends Application {

    private static int direction = 0; // 0 = left, 1 = right, 2 = up, 3 = down
    @Override
    public void start(Stage stage) throws IOException {
        //Objects
        SnakeHead snakeHead = new SnakeHead(1280/2,720/2);
        
        // Add all the objects to draw to this group
        Group groupOfNodes = new Group();
        groupOfNodes.getChildren().add(snakeHead.getRectangle());

        // Scene at 1280x720 pixels
        Scene scene = new Scene(groupOfNodes, 1280, 720);

        // Make the screen record key press
        scene = sceneSetKeyPress(scene);

        // Create a Window
        scene.setFill(Color.BLACK);
        stage.setTitle("Snake!");
        stage.setScene(scene);
        stage.show();


        new AnimationTimer() {
            @Override
            public void handle(long currentNanoTime) {
                snakeHead.setSnakeMovement(direction);

            }
        }.start();
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