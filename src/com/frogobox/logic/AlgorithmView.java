package com.frogobox.logic;

import com.frogobox.helper.comparator.EngagementComp;
import com.frogobox.helper.comparator.FollowerComp;
import com.frogobox.helper.comparator.FuzzyEngagementComp;
import com.frogobox.helper.comparator.FuzzyFollowerComp;
import com.frogobox.model.Data;
import com.frogobox.model.DataFuzzy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Comparator;

import static com.frogobox.base.BaseHelper.LINE_VIEW;

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

    public void setupWriteFuzzySortCsv(Comparator<DataFuzzy> comparator, BufferedWriter bufferedWriter) {
        for (DataFuzzy dataFuzzy : algorithm.arrayDataFuzzyLogic(comparator)) {
            try {
                String output = dataFuzzy.getId() + "," + dataFuzzy.getFollowerCount() + "," + dataFuzzy.getFollowerCount() + "," + dataFuzzy.getEngagementRate() + "," + dataFuzzy.getFuzzyOutput();
                bufferedWriter.write(output);bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setupWriteFuzzySortTxt(Comparator<DataFuzzy> comparator, BufferedWriter bufferedWriter) {
        for (DataFuzzy dataFuzzy : algorithm.arrayDataFuzzyLogic(comparator)) {
            try {
                bufferedWriter.write(dataFuzzy.toString());bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setupResultFuzzySort(Comparator<DataFuzzy> comparator) {
        for (DataFuzzy dataFuzzy : algorithm.arrayDataFuzzyLogic(comparator)) {
            System.out.println(dataFuzzy.toString());
        }
    }

    public void showImportantData(){
        // jumlah linguistik, bentuk fungsi keanggotaan, rule inferensi,
        System.out.println("Highest Follower Count  : " + algorithm.getHighestFollower());
        System.out.println("Highest Engagement Rate : " + algorithm.getHighestEngagement());

        System.out.println("Mid Follower Count      : " + algorithm.getMidFollower());
        System.out.println("Mid Engagement Rate     : " + algorithm.getMidEngagement());

        System.out.println("Lowest Follower Count   : " + algorithm.getLowestFollower());
        System.out.println("Lowest Engagement Rate  : " + algorithm.getLowestEngagement());

        System.out.println("Average Follower Count  : " + algorithm.getAverageFollower());
        System.out.println("Average Engagement Rate : " + algorithm.getAverageEngagement());

        System.out.println(LINE_VIEW);

        System.out.println("ACCEPT     : (Follower > AverageFollower) && (EngagementRate > AverageEngagementRate)");
        System.out.println("ACCEPTABLE : (Follower > AverageFollower) || (EngagementRate > AverageEngagementRate)");
        System.out.println("REJECT     : Which is not the result of both");

        System.out.println();

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

        System.out.println();

    }

    public void showResultFuzzy(){
        System.out.println("Priority By Follower");
        System.out.println(LINE_VIEW);
        setupResultFuzzySort(new FuzzyFollowerComp());

        System.out.println();

        System.out.println("Priority By Engagement Rate");
        System.out.println(LINE_VIEW);
        setupResultFuzzySort(new FuzzyEngagementComp());
    }


}
