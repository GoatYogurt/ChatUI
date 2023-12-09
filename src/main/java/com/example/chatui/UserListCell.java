package com.example.chatui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class UserListCell extends ListCell<User> {
    private ImageView imageView = new ImageView();

    @Override
    public void updateItem(User user, boolean empty) {
        super.updateItem(user, empty);

        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            imageView.setImage(user.getAvatar());
            imageView.setClip(new Circle(25, 25, Main.AVATAR_RADIUS));
            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            setText(user.getName());
            setGraphic(imageView);
        }
    }
}
