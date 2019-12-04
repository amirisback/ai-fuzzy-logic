package com.frogobox.helper;

import com.frogobox.base.BaseHelper;
import com.frogobox.logic.AlgorithmView;
import com.frogobox.model.DataFuzzy;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;

import static com.frogobox.base.BaseHelper.*;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * GeneticAlgorithm
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
public class FileCrudHelper {

    public void createFolderOutPut(){
        try {
            File outputDir = new File(PATH_OUTPUT_DATA);
            if (!outputDir.exists()) {
                outputDir.mkdir();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createFileTxt(String fileName, Comparator<DataFuzzy> comparator) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            File file = new File(new BaseHelper().getPathOutputFolderTxt(fileName));
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(PATH_ROOT_PROJECT + new BaseHelper().getPathOutputFolderTxt(fileName));
            bufferedWriter.newLine();
            new AlgorithmView().setupWriteFuzzySortTxt(comparator, bufferedWriter);

        } catch (IOException e) {
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
                Desktop.getDesktop().open(new File(new BaseHelper().getPathOutputFolderTxt(fileName)));
            } catch (IOException ex) {
            }
        }

    }

    public void createFileCsv(String fileName, Comparator<DataFuzzy> comparator) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            File file = new File(new BaseHelper().getPathOutputFolderCsv(fileName));
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            new AlgorithmView().setupWriteFuzzySortCsv(comparator, bufferedWriter);

        } catch (IOException e) {
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
                Desktop.getDesktop().open(new File(new BaseHelper().getPathOutputFolderCsv(fileName)));
            } catch (IOException ex) {
            }
        }

    }

}
