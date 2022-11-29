package com.example.agiletestgroupproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
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
    }

    public static void main(String[] args) {
        launch();
    }
}