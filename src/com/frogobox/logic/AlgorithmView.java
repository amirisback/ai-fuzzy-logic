package com.frogobox.logic;

import com.frogobox.helper.comparator.SortComp;
import com.frogobox.helper.comparator.FuzzyComp;
import com.frogobox.model.Data;
import com.frogobox.model.DataFuzzy;

import java.io.BufferedWriter;
import java.io.IOException;
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
public class AlgorithmView {

    private Algorithm algorithm = new Algorithm();

    public void setupShowDataOri() {
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
        ArrayList<DataFuzzy> fuzzyArrayList = algorithm.arrayDataFuzzyLogic(comparator);
        for (int i = 0; i < 20; i++) {
            try {
                bufferedWriter.write(fuzzyArrayList.get(i).getId());
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setupWriteFuzzySortTxt(Comparator<DataFuzzy> comparator, BufferedWriter bufferedWriter) {
        ArrayList<DataFuzzy> fuzzyArrayList = algorithm.arrayDataFuzzyLogic(comparator);
        for (int i = 0; i < 20; i++) {
            try {
                bufferedWriter.write(fuzzyArrayList.get(i).toString());
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setupResultFuzzySort(Comparator<DataFuzzy> comparator) {
        ArrayList<DataFuzzy> fuzzyArrayList = algorithm.arrayDataFuzzyLogic(comparator);
        for (int i = 0; i < fuzzyArrayList.size(); i++) {
            if (i == 20) {
                System.out.println("\nWhich was not selected");
                System.out.println(LINE_VIEW);
                System.out.println(fuzzyArrayList.get(i).toString());
            } else {
                System.out.println(fuzzyArrayList.get(i).toString());
            }

        }
    }

    public void showImportantData() {
        // jumlah linguistik, bentuk fungsi keanggotaan, rule inferensi,
        System.out.println("Highest Follower Count  : " + algorithm.getHighestFollower());
        System.out.println("Highest Engagement Rate : " + algorithm.getHighestEngagement());

        System.out.println("Mid Follower Count      : " + algorithm.getMidFollower());
        System.out.println("Mid Engagement Rate     : " + algorithm.getMidEngagement());

        System.out.println("Lowest Follower Count   : " + algorithm.getLowestFollower());
        System.out.println("Lowest Engagement Rate  : " + algorithm.getLowestEngagement());

        System.out.println(LINE_VIEW);
        System.out.println();

    }

    public void showSortByComparator() {
        System.out.println("Original Data");
        setupShowDataOri();

        System.out.println();

        System.out.println("Sort By Follower Count");
        setupSortByComparator(new SortComp(PARAM_FOLLOWER));

        System.out.println();

        System.out.println("Sort By Engagement Rate");
        setupSortByComparator(new SortComp(PARAM_ENGAGEMENT));

        System.out.println();

    }

    public void showResultFuzzy() {
        System.out.println("Fuzzy Output (Chosen Influencers)");
        System.out.println(LINE_VIEW);
        setupResultFuzzySort(new FuzzyComp());
    }

}