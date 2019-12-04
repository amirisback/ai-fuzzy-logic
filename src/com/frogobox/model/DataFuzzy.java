package com.frogobox.model;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Artificial-intelligence-fuzzy-logic
 * Copyright (C) 04/12/2019.
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
public class DataFuzzy {
    private String id;
    private int followerCount;
    private double engagementRate;
    private String fuzzyOutput;

    public DataFuzzy(String id, int followerCount, double engagementRate, String fuzzyOutput) {
        this.id = id;
        this.followerCount = followerCount;
        this.engagementRate = engagementRate;
        this.fuzzyOutput = fuzzyOutput;
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

    public String getFuzzyOutput() {
        return fuzzyOutput;
    }

    public void setFuzzyOutput(String fuzzyOutput) {
        this.fuzzyOutput = fuzzyOutput;
    }

    @Override
    public String toString() {
        return "Data{id = " + id + ",\t followerCount = " + followerCount + ",\t engagementRate = " + engagementRate + ",\t fuzzyOutput = " + fuzzyOutput + "}";
    }
}
