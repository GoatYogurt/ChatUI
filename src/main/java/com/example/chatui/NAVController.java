package com.example.chatui;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class NAVController extends Controller implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Parent userListLoader = null;
        try {
            userListLoader = FXMLLoader.load(Objects.requireNonNull(UserListController.class.getResource("userList.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        rootAnchor.getChildren().add(userListLoader);
    }
}
