package com.mes.pdq.pilot.converter;

import com.mes.pdq.pilot.modules.ResultData;

import java.util.ArrayList;

public class ConvertFileColumnToResultData {

    public void convert(String line, ArrayList<ResultData> resultData) {




    }
    private int convertToInt(String text) {
        return Integer.parseInt(text);
    }

    private double convertDoubleToInt(String d) {
        return Double.parseDouble(d);
    }

}