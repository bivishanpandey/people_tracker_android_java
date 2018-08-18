package com.project.natsu_dragneel.people_tracker_android_java.classes;

public class CreateUser {

    public String name;
    public String email;
    public String password;
    public String date;
    public String code;
    public String isSharing;
    public String lat;
    public String lng;
    public String imageURL;
    public String userID;

    public CreateUser(){}

    public CreateUser(String name, String email, String password, String date, String code, String isSharing, String lat, String lng, String imageURL, String userID) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.date=date;
        this.code = code;
        this.isSharing = isSharing;
        this.lat = lat;
        this.lng = lng;
        this.imageURL = imageURL;
        this.userID = userID;
    }
}
