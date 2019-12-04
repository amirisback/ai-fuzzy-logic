package com.frogobox.logic;

import com.frogobox.helper.comparator.EngagementComp;
import com.frogobox.helper.comparator.FollowerComp;
import com.frogobox.model.Data;
import com.frogobox.view.AlgorithmView;

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
public class Interpreter implements AlgorithmView {

    private Algorithm algorithm = new Algorithm(this);

    public void showSortByComparator() {
        System.out.println("Original Data");
        algorithm.setupShowDataOri();

        System.out.println();

        System.out.println("Sort By Follower Count");
        algorithm.setupSortByComparator(new FollowerComp());

        System.out.println();

        System.out.println("Sort By Engagement Rate");
        algorithm.setupSortByComparator(new EngagementComp());
    }

    @Override
    public void outputData(Data data) {
        System.out.println(data.toString());
    }
}
