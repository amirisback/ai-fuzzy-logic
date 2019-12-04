package com.frogobox.helper.comparator;

import com.frogobox.model.Data;

import java.util.Comparator;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Artificial-intelligence-fuzzy-logic
 * Copyright (C) 23/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.helper
 */
public class FollowerComp implements Comparator<Data> {

    @Override
    public int compare(Data dataA, Data dataB) {
        return dataB.getFollowerCount() - dataA.getFollowerCount();
    }

}
