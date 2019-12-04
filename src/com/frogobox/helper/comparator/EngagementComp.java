package com.frogobox.helper.comparator;

import com.frogobox.model.Data;

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
 * com.frogobox.helper.sort
 */
public class EngagementComp implements Comparator<Data> {

    @Override
    public int compare(Data dataA, Data dataB) {
        return (int) (dataB.getEngagementRate() - dataA.getEngagementRate());
    }

}
