package com.frogobox.logic;

import com.frogobox.helper.RawDataHelper;
import com.frogobox.helper.comparator.EngagementComp;
import com.frogobox.helper.comparator.FollowerComp;
import com.frogobox.model.Data;

import java.util.ArrayList;
import java.util.Comparator;

import static com.frogobox.base.BaseHelper.PATH_RAW_CSV_DATA;

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
        return rawDataArraySort(new FollowerComp()).get(indexHighest()).getFollowerCount();
    }

    public int getLowestFollower() {
        return rawDataArraySort(new FollowerComp()).get(indexLowest(new FollowerComp())).getFollowerCount();
    }

    public int getMidFollower() {
        return rawDataArraySort(new FollowerComp()).get(indexMid(new FollowerComp())).getFollowerCount();
    }

    public int getAverageFollower(){
        int temp = 0;
        for (int i = 0; i < rawDataArray().size(); i++) {
            temp = temp + rawDataArray().get(i).getFollowerCount();
        }
        return temp / rawDataArray().size();
    }

    public double getHighestEngagement() {
        return rawDataArraySort(new EngagementComp()).get(indexHighest()).getEngagementRate();
    }

    public double getLowestEngagement() {
        return rawDataArraySort(new EngagementComp()).get(indexLowest(new EngagementComp())).getEngagementRate();
    }

    public double getMidEngagement() {
        return rawDataArraySort(new EngagementComp()).get(indexMid(new EngagementComp())).getEngagementRate();
    }

    public double getAverageEngagement(){
        double temp = 0.0;
        for (int i = 0; i < rawDataArray().size(); i++) {
            temp = temp + rawDataArray().get(i).getEngagementRate();
        }
        return temp / rawDataArray().size();
    }

}
