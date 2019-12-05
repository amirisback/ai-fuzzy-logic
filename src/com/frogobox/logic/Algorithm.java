package com.frogobox.logic;

import com.frogobox.helper.RawDataHelper;
import com.frogobox.helper.comparator.SortComp;
import com.frogobox.model.Data;
import com.frogobox.model.DataFuzzy;

import java.util.ArrayList;
import java.util.Comparator;

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
 * com.frogobox.logic
 */
public class Algorithm {

    public ArrayList<Data> rawDataArray() {
        return new RawDataHelper().fetchData(PATH_RAW_CSV_DATA);
    }

    public ArrayList<Data> rawDataArraySort(Comparator<Data> comparator) {
        ArrayList<Data> sortRawData = rawDataArray();
        sortRawData.sort(comparator);
        return sortRawData;
    }

    public int indexLowest(Comparator<Data> comparator) {
        return rawDataArraySort(comparator).size() - 1;
    }

    public int indexHighest() {
        return 0;
    }

    public int indexMid(Comparator<Data> comparator) {
        return rawDataArraySort(comparator).size() / 2;
    }

    public int getHighestFollower() {
        return rawDataArraySort(new SortComp(PARAM_FOLLOWER)).get(indexHighest()).getFollowerCount();
    }

    public int getLowestFollower() {
        return rawDataArraySort(new SortComp(PARAM_FOLLOWER)).get(indexLowest(new SortComp(PARAM_FOLLOWER))).getFollowerCount();
    }

    public int getMidFollower() {
        return (getHighestFollower() - getLowestFollower()) / 2;
    }

    public int getAverageFollower(){
        int temp = 0;
        for (int i = 0; i < rawDataArray().size(); i++) {
            temp = temp + rawDataArray().get(i).getFollowerCount();
        }
        return temp / rawDataArray().size();
    }

    public double getHighestEngagement() {
        return rawDataArraySort(new SortComp(PARAM_ENGAGEMENT)).get(indexHighest()).getEngagementRate();
    }

    public double getLowestEngagement() {
        return rawDataArraySort(new SortComp(PARAM_ENGAGEMENT)).get(indexLowest(new SortComp(PARAM_ENGAGEMENT))).getEngagementRate();
    }

    public double getMidEngagement() {
        return (getHighestEngagement() - getLowestEngagement()) / 2;
    }

    public double getAverageEngagement(){
        double temp = 0.0;
        for (int i = 0; i < rawDataArray().size(); i++) {
            temp = temp + rawDataArray().get(i).getEngagementRate();
        }
        return temp / rawDataArray().size();
    }

    public boolean checkAcceptableFollower(int followerCount){
        return (followerCount >= getMidFollower()) && followerCount <= getHighestFollower();
    }

    public boolean checkAcceptableEngagementCount(double engagementRate){
        return (engagementRate >= getMidEngagement()) && engagementRate <= getHighestEngagement();
    }

    public boolean checkAcceptInfluencer(int followerCount, double engagementRate){
        return checkAcceptableFollower(followerCount) && checkAcceptableEngagementCount(engagementRate);
    }

    public boolean checkAcceptableInfluencer(int followerCount, double engagementRate){
        return checkAcceptableFollower(followerCount) || checkAcceptableEngagementCount(engagementRate);
    }

    public ArrayList<DataFuzzy> arrayDataFuzzyLogic(Comparator<DataFuzzy> comparator){
        ArrayList<DataFuzzy> chosenArrayList = new ArrayList<>();

        int state = 0;
        for (Data data : rawDataArray()) {
            if (checkAcceptInfluencer(data.getFollowerCount(), data.getEngagementRate())) {
                state = 2;
            } else {
                if (checkAcceptableInfluencer(data.getFollowerCount(), data.getEngagementRate())) {
                    state = 1;
                } else {
                    state = 0;
                }
            }
            DataFuzzy dataFuzzy = new DataFuzzy(data.getId(), data.getFollowerCount(), data.getEngagementRate(), state);
            chosenArrayList.add(dataFuzzy);
        }

        chosenArrayList.sort(comparator);

        return chosenArrayList;
    }

}
