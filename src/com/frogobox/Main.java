package com.frogobox;

import com.frogobox.helper.RawDataHelper;
import com.frogobox.model.Data;

import java.util.ArrayList;
import java.util.Date;

import static com.frogobox.base.BaseHelper.PATH_RAW_CSV_DATA;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        new Main().onCreate();
    }

    private void onCreate(){
        setupIntroView();
        setupGetRawData();
    }

    private void setupIntroView(){

    }

    private void setupGetRawData(){
        ArrayList<Data> rawDataArray = new RawDataHelper().fetchData(PATH_RAW_CSV_DATA);
        for (Data data : rawDataArray) {
            System.out.println(data.toString());
        }
    }

}
