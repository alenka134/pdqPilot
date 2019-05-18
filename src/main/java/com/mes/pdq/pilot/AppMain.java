package com.mes.pdq.pilot;

import com.mes.pdq.pilot.modules.ExperimentData;
import com.mes.pdq.pilot.readdata.ImportExperimentData;

import java.io.FileNotFoundException;

public class AppMain {
    public static void main(String[] args) {

        ImportExperimentData importExperimentData = new ImportExperimentData();
        try {
            ExperimentData experimentData = importExperimentData.readCSV();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
