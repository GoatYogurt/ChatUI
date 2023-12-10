package com.example.chatui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class UserListController extends Controller implements Initializable {
    private ObservableList<User> users = getAllUsers();

    @FXML
    private ListView<User> userListView = new ListView<>(users);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userListView.setCellFactory(userListView -> new UserListCell());
        userListView.getItems().addAll(users);
    }

    public ObservableList<User> getAllUsers() {
        return FXCollections.observableArrayList(
                new User("Nguyen Hai Nam", new Image("file:src\\main\\resources\\nam.png"), "Hello"),
                new User("Nguyen Anh Vu", new Image("file:src\\main\\resources\\facebook.png"), "Hi"),
                new User("Phan Duc Quan", new Image("file:src\\main\\resources\\facebook.png"), "Hello"),
                new User("Duong Gia Huan", new Image("file:src\\main\\resources\\facebook.png"), "Hi"),
                new User("Nguyen Huu Thang", new Image("file:src\\main\\resources\\facebook.png"), "Hello"),
                new User("Tran Huu Cuong", new Image("file:src\\main\\resources\\facebook.png"), "Hi"),
                new User("Ta Xuan Duy", new Image("file:src\\main\\resources\\facebook.png"), "Hello"),
                new User("Le Hai Minh", new Image("file:src\\main\\resources\\facebook.png"), "Hi"),
                new User("Lam Nguyen Duy Phong", new Image("file:src\\main\\resources\\facebook.png"), "Hello"),
                new User("Chu Huy Quang", new Image("file:src\\main\\resources\\facebook.png"), "Hi"),
                new User("Nguyen Duc Tam", new Image("file:src\\main\\resources\\facebook.png"), "Hello"),
                new User("Nguyen Ba Thinh", new Image("file:src\\main\\resources\\facebook.png"), "Hi"),
                new User("Nguyen Huy Minh", new Image("file:src\\main\\resources\\facebook.png"), "Hello")
        );
    }

    @FXML
    public void switchToUserMessageScene(MouseEvent event) throws IOException {
        String currentUserName = userListView.getFocusModel().getFocusedItem().getName().split("\n")[0];
        currentUserName = currentUserName.replace(" ","");
        currentUserName = currentUserName.toLowerCase();

        String currentUserNamePath = currentUserName + ".fxml";
        System.out.println(currentUserNamePath);

        FXMLLoader loader = new FXMLLoader(getClass().getResource(currentUserNamePath));
        scene = new Scene(loader.load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("application.css")).toExternalForm());
        Main.primaryStage.setScene(scene);
        Main.primaryStage.show();
    }
}
