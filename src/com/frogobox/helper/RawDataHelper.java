package com.frogobox.helper;

import com.frogobox.model.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Artificial-intelligence-genetic-algorithm
 * Copyright (C) 16/11/2019.
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
public class RawDataHelper {

    public int getSumFetchDataInLine(String sourceRaw) {
        int sum = 0;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(sourceRaw));
            String column = reader.readLine();
            String[] splitString = column.split(",");
            sum = splitString.length;
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }

    public ArrayList<Data> fetchData(String sourceRaw) {
        ArrayList<Data> dataArrayList = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(sourceRaw));
            String column;
            while ((column = reader.readLine()) != null) {
                String[] splitString = column.split(",");
                ArrayList<String> partTemp = new ArrayList<>();
                Collections.addAll(partTemp, splitString);
                Data mData = new Data(partTemp.get(0), Integer.parseInt(partTemp.get(1)), Double.parseDouble(partTemp.get(2)));
                dataArrayList.add(mData);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataArrayList;
    }

    public ArrayList<String> fetchTargetData(String sourceRaw) {
        ArrayList<String> practiceString = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(sourceRaw));
            String column;
            while ((column = reader.readLine()) != null) {
                practiceString.add(column);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return practiceString;
    }

}
