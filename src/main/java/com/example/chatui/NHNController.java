package com.example.chatui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class NHNController extends Controller implements Initializable {
    @FXML
    private ImageView callIcon = new ImageView();
    @FXML
    private ImageView videoCallIcon = new ImageView();
    @FXML
    private ImageView searchIcon = new ImageView();
    @FXML
    private ImageView moreOptionsIcon = new ImageView();
    @FXML
    private ImageView attachmentIcon = new ImageView();
    public void initialize(URL url, ResourceBundle resourceBundle) {
        callIcon.setImage(new Image("file:src\\main\\resources\\call.png"));
        moreOptionsIcon.setImage(new Image("file:src\\main\\resources\\moreOption.png"));
        searchIcon.setImage(new Image("file:src\\main\\resources\\search.png"));
        videoCallIcon.setImage(new Image("file:src\\main\\resources\\videoCall.png"));
        attachmentIcon.setImage(new Image("file:src\\main\\resources\\attachment.png"));
        Parent userListLoader = null;
        try {
            userListLoader = FXMLLoader.load(Objects.requireNonNull(UserListController.class.getResource("userList.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        rootAnchor.getChildren().add(userListLoader);
    }
}
