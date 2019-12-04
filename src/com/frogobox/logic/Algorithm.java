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

    private ArrayList<Data> rawDataArray(Comparator<Data> comparator) {
        ArrayList<Data> dataArrayList = new RawDataHelper().fetchData(PATH_RAW_CSV_DATA);
        dataArrayList.sort(comparator);
        return dataArrayList;
    }

    public int getHighestFollower() {
        return rawDataArray(new FollowerComp()).get(0).getFollowerCount();
    }

    public int getLowestFollower() {
        return rawDataArray(new FollowerComp()).get(rawDataArray(new FollowerComp()).size() - 1).getFollowerCount();
    }

    public double getHighestEngagement(){
        return rawDataArray(new EngagementComp()).get(0).getEngagementRate();
    }

    public double getLowestEngagement(){
        return rawDataArray(new EngagementComp()).get(rawDataArray(new EngagementComp()).size() - 1).getEngagementRate();
    }

    public void setupSortByComparator(Comparator<Data> comparator) {
        for (Data data : rawDataArray(comparator)) {
            System.out.println(data.toString());
        }
    }

    public void showSortByComparator() {
        System.out.println("Sort By Follower Count");
        setupSortByComparator(new FollowerComp());
        System.out.println();
        System.out.println("Sort By Engagement Rate");
        setupSortByComparator(new EngagementComp());
    }

}
