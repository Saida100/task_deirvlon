package com.saida_aliyeva.task_deirvlon.model;

public class Newsfeed {
    private String id;
    private String title;
    private String text;
    private String tag;
    private String img;
    private String createdAt;
    private Integer appVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        return "Newsfeed{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", tag='" + tag + '\'' +
                ", img='" + img + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", appVersion=" + appVersion +
                '}';
    }
}
