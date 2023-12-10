package com.example.chatui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public static Stage primaryStage;
    public static final String APP_TITLE = "retardChat";
    public static final int AVATAR_RADIUS = 19;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("nguyenhainam.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("application.css")).toExternalForm());
        primaryStage.setTitle(Main.APP_TITLE);
        primaryStage.setResizable(false);
        primaryStage.setWidth(900);
        primaryStage.setHeight(600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}