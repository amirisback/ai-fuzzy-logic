package com.frogobox.helper.comparator;

import com.frogobox.model.Data;

import java.util.Comparator;

import static com.frogobox.base.BaseHelper.PARAM_FOLLOWER;

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
public class SortComp implements Comparator<Data> {

    private String param;

    public SortComp(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public int compare(Data dataA, Data dataB) {
        if (param.equalsIgnoreCase(PARAM_FOLLOWER)) {
            return dataB.getFollowerCount() - dataA.getFollowerCount();
        } else {
            return (int) dataB.getEngagementRate() - (int) dataA.getEngagementRate();
        }
    }

}
