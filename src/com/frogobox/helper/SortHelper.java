package com.frogobox.helper;

import com.frogobox.model.Data;

import java.util.Comparator;

import static com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary.stringToInt;

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
public class SortHelper implements Comparator<Data> {

    @Override
    public int compare(Data dataA, Data dataB) {
        return dataB.getFollowerCount() - dataA.getFollowerCount();
    }

}
