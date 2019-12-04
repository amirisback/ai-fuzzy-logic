package com.frogobox.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
 * Copyright (C) 28/09/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.base
 */
public class BaseHelper {

    public BaseHelper() {
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Path Raw
    public static final String FILENAME = "Chosen-Fuzzy-Logic";
    public static final String EXTENSION_TXT = ".txt";
    public static final String EXTENSION_CSV = ".csv";
    public static final String PATH_OUTPUT_DATA = "result";
    public static final String PATH_ROOT_PROJECT = "Folder Output : [root_project]/";
    public String PATH_FILE_TIME = "#" + getDateNow() + EXTENSION_TXT;
    // -----------------------------------------------------------------------------------------------------------------
    // Path Raw Data
    public static final String BASE_PATH_RAW = "src/com/frogobox/raw";
    public static final String PATH_DATA_CSV = "/influencers" + EXTENSION_CSV;
    public static final String PATH_RAW_CSV_DATA = BASE_PATH_RAW + PATH_DATA_CSV;
    // -----------------------------------------------------------------------------------------------------------------
    public static final String LINE_VIEW = "--------------------------------------------";
    // -----------------------------------------------------------------------------------------------------------------
    public static final String FUZZY_ACCEPT = "ACCEPT";
    public static final String FUZZY_ACCEPTABLE = "ACCEPTABLE";
    public static final String FUZZY_REJECT = "REJECT";

    public static final int SUM_CHOSEN_INFLUENCERS = 20;


    public String getPathOutputFolder(String fileName) {
        return PATH_OUTPUT_DATA + "/" + fileName + PATH_FILE_TIME;
    }

    public static int randomNumber(int range) {
        return new Random().nextInt(range);
    }

    public static int randomNumber(int min, int max) {
        return min + (max - min) * new Random().nextInt();
    }

    public static double randomNumber(double min, double max) {
        return min + (max - min) * new Random().nextDouble();
    }

    public String getDateNow() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(new Date());
    }

    public String getTimeNow() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(new Date());
    }

    public int stringToInt(String string){
        return Integer.parseInt(string);
    }

}
