package com.example.apiappdemo;

import com.google.gson.annotations.SerializedName;

public class Trns {

    @SerializedName("name")
    private String name;
    @SerializedName("slug")
    private String slug;
    @SerializedName("img")
    private String img;
    @SerializedName("status")
    private String status;

    public Trns(String name, String slug, String img, String status) {
        this.name = name;
        this.slug = slug;
        this.img = img;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
