package com.example.agiletestgroupproject;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Snake extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Add all the objects to draw to this group
        Group groupOfNodes = new Group();

        // Scene at 1280x720 pixels
        Scene scene = new Scene(groupOfNodes, 1280, 720);
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
        scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            if(key.getCode()== KeyCode.LEFT) {
            }
            else if (key.getCode() == KeyCode.RIGHT) {
            }
            else if (key.getCode() == KeyCode.UP) {
            }
            else if (key.getCode() == KeyCode.DOWN) {
            }
        });

        return scene;
    }
}