package com.mes.pdq.pilot.converter;

import com.mes.pdq.pilot.modules.ExperimentData;

public class ConverterTextDataToExperimentData {

    private ConvertFileRowToProtocolData convertFileRowToProtocolData = new ConvertFileRowToProtocolData();
    private ConvertFileColumnToResultData convertFileColumnToResultData = new ConvertFileColumnToResultData();

    public void convert(int lineNumber, String line, ExperimentData experimentData) {

        if (lineNumber >= 0 && lineNumber < 12) {
            // TODO: 31/03/2019 create converter
            System.out.println("--> " + line);
            convertFileRowToProtocolData.convert(line, experimentData.getProtocolData());

        }

        if (lineNumber > 12 && lineNumber < 151) {
            System.out.println("time test " + line);
        }
        if (lineNumber >= 154 && lineNumber < 165) {
            System.out.println("Test result " + line);
            convertFileColumnToResultData.convert(line, experimentData.getResultData());
        }
    }

}
