package com.example.chatui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
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
                new User("Nguyễn Hải Nam", new Image("file:src\\main\\resources\\nam.png")),
                new User("Nguyen Anh Vu", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Phan Duc Quan", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Duong Gia Huan", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Nguyen Huu Thang", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Tran Huu Cuong", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Ta Xuan Duy", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Le Hai Minh", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Lam Nguyen Duy Phong", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Chu Huy Quang", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Nguyen Duc Tam", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Nguyen Ba Thinh", new Image("file:src\\main\\resources\\facebook.jpg")),
                new User("Nguyen Huy Minh", new Image("file:src\\main\\resources\\facebook.jpg"))
        );
    }
}
