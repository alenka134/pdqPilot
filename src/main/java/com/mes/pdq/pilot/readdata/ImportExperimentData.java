package com.mes.pdq.pilot.readdata;

import com.mes.pdq.pilot.converter.ConverterTextDataToExperimentData;
import com.mes.pdq.pilot.modules.ExperimentData;
import com.mes.pdq.pilot.modules.ProtocolData;
import com.mes.pdq.pilot.modules.ResultData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ImportExperimentData {

    public ExperimentData readCSV ()throws FileNotFoundException {
        String fileName = "/Users/alenka/Documents/150415AB.CSV";

        File textFile = new File(fileName);

        Scanner scanner = new Scanner(textFile);

        ConverterTextDataToExperimentData converterTextDataToExperimentData = new ConverterTextDataToExperimentData();
        ExperimentData experimentData = new ExperimentData();
        experimentData.setProtocolData(new ProtocolData());
        experimentData.setResultData(new ArrayList<>());

        int lineNumber = 1;
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            converterTextDataToExperimentData.convert(lineNumber,line,experimentData);
            lineNumber++;
        }

        scanner.close();

        return experimentData;
    }


}
