package com.frogobox.helper;

import com.frogobox.base.BaseHelper;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.frogobox.base.BaseHelper.PATH_OUTPUT_DATA;
import static com.frogobox.base.BaseHelper.PATH_ROOT_PROJECT;

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

    public void createFileTxt(String fileName) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {

            File file = new File(new BaseHelper().getPathOutputFolder(fileName));
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(PATH_ROOT_PROJECT + new BaseHelper().getPathOutputFolder(fileName));
            bufferedWriter.newLine();

        } catch (IOException e) {
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
                Desktop.getDesktop().open(new File(new BaseHelper().getPathOutputFolder(fileName)));
            } catch (IOException ex) {
            }
        }

    }

    public void outputMain(String fileName){
        createFolderOutPut();
        createFileTxt(fileName);
    }

}
