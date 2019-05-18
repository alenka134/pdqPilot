package com.mes.pdq.pilot.converter;

import com.mes.pdq.pilot.modules.ExperimentData;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTextDataToExperimentDataTest {

    @Test
    public void shouldConvertLine(){
        ExperimentData data = new ExperimentData();

        ConverterTextDataToExperimentData converter = new ConverterTextDataToExperimentData();
        converter.convert(1,"Test results:", data);
    }

}