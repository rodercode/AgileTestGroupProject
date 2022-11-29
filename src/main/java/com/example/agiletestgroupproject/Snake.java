package com.example.agiletestgroupproject;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Snake extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // Add all the objects to draw to this group
        Group groupOfNodes = new Group();

        // Create a Snake Head
        Rectangle rectangle = new Rectangle(1280/2,720/2,40,40);
        rectangle.setFill(Color.GREEN);
        groupOfNodes = new Group(rectangle);


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
            @Override public void handle(long currentNanoTime) {

            }
        }.start();
    }

    public static void main(String[] args) {
        launch();
    }

    public static Scene sceneSetKeyPress(Scene scene){
        //Records the key press
        scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            if(key.getCode()== KeyCode.LEFT) {
                System.out.println("Left arrow key pressed");
            }
            else if (key.getCode() == KeyCode.RIGHT) {
                System.out.println("Right arrow key pressed");
            }
            else if (key.getCode() == KeyCode.UP) {
                System.out.println("Up arrow key pressed");
            }
            else if (key.getCode() == KeyCode.DOWN) {
                System.out.println("Down arrow key pressed");
            }
        });

        return scene;
    }
}