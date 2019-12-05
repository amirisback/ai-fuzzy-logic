package com.frogobox.model;

import static com.frogobox.base.BaseHelper.*;

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
    private int fuzzyOutput;

    public DataFuzzy(String id, int followerCount, double engagementRate, int fuzzyOutput) {
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

    public int getFuzzyOutput() {
        return fuzzyOutput;
    }

    public void setFuzzyOutput(int fuzzyOutput) {
        this.fuzzyOutput = fuzzyOutput;
    }

    @Override
    public String toString() {

        String state ="";
        if (fuzzyOutput == 2) {
            state = FUZZY_ACCEPT;
        } else if (fuzzyOutput ==1 ) {
            state = FUZZY_ACCEPTABLE;
        } else {
            state = FUZZY_REJECT;
        }

        return "Data{id = " + id + ",\t followerCount = " + followerCount + ",\t engagementRate = " + engagementRate + ",\t fuzzyOutput = " + state + "}";
    }
}
