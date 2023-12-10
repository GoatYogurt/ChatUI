package com.example.chatui;

import javafx.scene.image.Image;

public class User {
    private String name;
    private Image avatar;
    private String latestMessage;

    public User(String name, Image avatar, String latestMessage) {
        this.name = name;
        this.avatar = avatar;
        this.latestMessage = latestMessage;
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

    public String getLatestMessage() {
        return latestMessage;
    }

    public void setLatestMessage(String latestMessage) {
        this.latestMessage = latestMessage;
    }
}
