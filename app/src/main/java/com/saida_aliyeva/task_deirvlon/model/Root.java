package com.saida_aliyeva.task_deirvlon.model;

import java.util.List;

public class Root {

    private List<Newsfeed> newsfeed=null;

    public List<Newsfeed> getNewsfeed() {
        return newsfeed;
    }

    public void setNewsfeed(List<Newsfeed> newsfeed) {
        this.newsfeed = newsfeed;
    }

    @Override
    public String toString() {
        return "Root{" +
                "newsfeed=" + newsfeed +
                '}';
    }
}
