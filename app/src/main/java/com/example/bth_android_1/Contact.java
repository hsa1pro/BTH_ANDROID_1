package com.example.bth_android_1;

public class Contact {
    private int id;
    private  String images;
    private String name;
    private String phone;
    private Boolean check;

    public Contact(int id, String images, String name, String phone) {
        this.id = id;
        this.images = images;
        this.name = name;
        this.phone = phone;
        this.check = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCheck(Boolean check) {this.check = check;}

    public Boolean getCheck() {return check;}
}
