package com.mes.pdq.pilot.converter;

import com.mes.pdq.pilot.modules.ProtocolData;


public class ConvertFileRowToProtocolData {

    public void convert(String line, ProtocolData protocolData) {

        if (line != null) {
            String[] split = line.split("=");

            switch (split[0].trim()) {

                case "PDQ serial number":
                    protocolData.setSerialNumber(convertToInt(split[1].trim()));
                    break;

                case "Protocol":
                    protocolData.setProtocolName(split[1].trim());
                    break;

                case "Test duration":
                    protocolData.setTestDuration(convertToInt(split[1].trim()));

                case "Block temperature":
                    protocolData.setBlockTemp(convertToInt(split[1].trim()));
                    break;

                case "BlankFilter":
                    protocolData.setBlankFilter(convertToInt(split[1].trim()));
                    break;

                case "BaseLineFilter":
                    protocolData.setBaseLineFilter(convertToInt(split[1].trim()));
                    break;

                case "GradientFilter":
                    protocolData.setGradientFilter(convertDoubleToInt(split[1].trim()));

                case "PRoC threshold":
                    protocolData.setPRoCthreshold(convertDoubleToInt(split[1].trim()));

                case "NRoC threshold":
                    protocolData.setNRoCthreshold(convertDoubleToInt(split[1].trim()));


            }


        }
    }


    private int convertToInt(String text) {
        return Integer.parseInt(text);
    }

    private double convertDoubleToInt(String d) {
        return Double.parseDouble(d);
    }


}
