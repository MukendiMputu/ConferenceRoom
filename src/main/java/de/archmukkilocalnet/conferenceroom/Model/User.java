package de.archmukkilocalnet.conferenceroom.Model;

public class User {
    private Integer Id;
    private String userName;

    public User(Integer id, String username) {
        this.Id = id;
        this.userName = username;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
