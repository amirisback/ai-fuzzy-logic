package com.frogobox;

import com.frogobox.logic.Interpreter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main().onCreate();
    }

    private void onCreate() {
        setupIntroView();
        setupAlgorithm();
    }

    private void setupIntroView() {
    }

    private void setupAlgorithm() {
        new Interpreter().showSortByComparator();
    }

}