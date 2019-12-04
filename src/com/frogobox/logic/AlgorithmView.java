package com.frogobox.logic;

import com.frogobox.helper.comparator.EngagementComp;
import com.frogobox.helper.comparator.FollowerComp;
import com.frogobox.helper.comparator.FuzzyEngagementComp;
import com.frogobox.helper.comparator.FuzzyFollowerComp;
import com.frogobox.model.Data;
import com.frogobox.model.DataFuzzy;

import java.util.Comparator;

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
public class AlgorithmView {

    private Algorithm algorithm = new Algorithm();

    public void runCall(){
        showImportantData();
        System.out.println();
        showResultFuzzy();

    }

    public void setupShowDataOri(){
        for (Data data : algorithm.rawDataArray()) {
            System.out.println(data.toString());
        }
    }

    public void setupSortByComparator(Comparator<Data> comparator) {
        for (Data data : algorithm.rawDataArraySort(comparator)) {
            System.out.println(data.toString());
        }
    }

    public void setupResultFuzzySort(Comparator<DataFuzzy> comparator) {
        for (DataFuzzy dataFuzzy : algorithm.arrayDataFuzzyLogic(comparator)) {
            System.out.println(dataFuzzy.toString());
        }
    }

    public void showImportantData(){
        System.out.println("Highest Follower Count  : " + algorithm.getHighestFollower());
        System.out.println("Highest Engagement Rate : " + algorithm.getHighestEngagement());

        System.out.println("Mid Follower Count      : " + algorithm.getMidFollower());
        System.out.println("Mid Engagement Rate     : " + algorithm.getMidEngagement());

        System.out.println("Lowest Follower Count   : " + algorithm.getLowestFollower());
        System.out.println("Lowest Engagement Rate  : " + algorithm.getLowestEngagement());

        System.out.println("Average Follower Count  : " + algorithm.getAverageFollower());
        System.out.println("Average Engagement Rate : " + algorithm.getAverageEngagement());
    }

    public void showSortByComparator() {
        System.out.println("Original Data");
        setupShowDataOri();

        System.out.println();

        System.out.println("Sort By Follower Count");
        setupSortByComparator(new FollowerComp());

        System.out.println();

        System.out.println("Sort By Engagement Rate");
        setupSortByComparator(new EngagementComp());
    }

    public void showResultFuzzy(){
        System.out.println("FOLLOWER");
        setupResultFuzzySort(new FuzzyFollowerComp());

        System.out.println();

        System.out.println("ENGAGEMENT");
        setupResultFuzzySort(new FuzzyEngagementComp());
    }


}
