package com.frogobox;

import com.frogobox.helper.FileCrudHelper;
import com.frogobox.helper.comparator.FuzzyComp;
import com.frogobox.logic.AlgorithmView;

import static com.frogobox.base.BaseHelper.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main().onCreate();
    }

    private void onCreate() {
        setupIntroView();
        setupProgramName();
        setupAlgorithm();
        setupCreateFileOutput();
    }

    private void setupIntroView() {
        System.out.println(LINE_VIEW);
        System.out.println("Muhammad Faisal Amir");
        System.out.println("1301198497");
        System.out.println("IFX-43-02");
        System.out.println(LINE_VIEW);
        System.out.println();
    }

    private void setupProgramName(){
        System.out.println("..:: Fuzzy Logic ::..");
        System.out.println(LINE_VIEW);
        System.out.println("Diketahui : ");
        System.out.println("Jumlah Influencer : 100");
        System.out.println(LINE_VIEW);
        System.out.println("Ditanya : ");
        System.out.println("20 Influencer Terbaik");
        System.out.println(LINE_VIEW);
        System.out.println("Solusi : ");
        System.out.println();
    }

    private void setupAlgorithm() {
        new AlgorithmView().showImportantData();
        new AlgorithmView().showResultFuzzy();
    }

    private void setupCreateFileOutput(){
        new FileCrudHelper().createFolderOutPut();
        new FileCrudHelper().createFileCsv(FILENAME, new FuzzyComp());
    }

}