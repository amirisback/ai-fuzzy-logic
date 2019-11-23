package com.frogobox.model;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Artificial-intelligence-fuzzy-logic
 * Copyright (C) 23/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.model
 */
public class Data {
    private String id;
    private String followerCount;
    private String engagementRate;

    public Data(String id, String followerCount, String engagementRate) {
        this.id = id;
        this.followerCount = followerCount;
        this.engagementRate = engagementRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(String followerCount) {
        this.followerCount = followerCount;
    }

    public String getEngagementRate() {
        return engagementRate;
    }

    public void setEngagementRate(String engagementRate) {
        this.engagementRate = engagementRate;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", followerCount='" + followerCount + '\'' +
                ", engagementRate='" + engagementRate + '\'' +
                '}';
    }
}
