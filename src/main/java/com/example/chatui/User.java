package com.example.chatui;

import javafx.scene.image.Image;

public class User {
    private String name;
    private Image avatar;

    public User(String name, Image avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }
}
