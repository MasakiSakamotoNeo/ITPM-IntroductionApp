package com.example.itpmintroductionapp.domain;

import java.io.Serializable;

public class ItemsDomain implements Serializable {

    private String title;
    private String address;
    private String description;
    private String pic;

    public ItemsDomain(String title, String address, String description, String pic) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
