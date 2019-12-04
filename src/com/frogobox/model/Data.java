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
    private int followerCount;
    private double engagementRate;

    public Data(String id, int followerCount, double engagementRate) {
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

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public double getEngagementRate() {
        return engagementRate;
    }

    public void setEngagementRate(double engagementRate) {
        this.engagementRate = engagementRate;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", followerCount=" + followerCount +
                ", engagementRate=" + engagementRate +
                '}';
    }
}
