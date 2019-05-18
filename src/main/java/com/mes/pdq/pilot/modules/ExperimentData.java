package com.mes.pdq.pilot.modules;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ExperimentData {
    private ProtocolData protocolData;
    private List<TestData> testData;
    private ArrayList<ResultData> resultData;


}
