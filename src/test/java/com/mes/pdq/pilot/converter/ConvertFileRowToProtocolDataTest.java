package com.mes.pdq.pilot.converter;

import com.mes.pdq.pilot.modules.ProtocolData;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertFileRowToProtocolDataTest {


    @Test
    public void shouldPopulateProtocolDataWithBlockTemp() {

        String line = "PDQ serial number = 0018";
        ProtocolData protocolData = new ProtocolData();
        ConvertFileRowToProtocolData convert = new ConvertFileRowToProtocolData();
        convert.convert(line, protocolData);

        ProtocolData expectedProtocolData = new ProtocolData();
        expectedProtocolData.setSerialNumber(18);

        assertEquals(expectedProtocolData, protocolData);
    }

    @Test
    public void shouldCheckEmptyRowsInProtocolData() {

        String line = null;
        ProtocolData protocolData = new ProtocolData();
        ConvertFileRowToProtocolData convert = new ConvertFileRowToProtocolData();
        convert.convert(line, protocolData);

        ProtocolData expectedProtocolData = new ProtocolData();

        assertEquals(expectedProtocolData, protocolData);
    }

    @Test
    public void shouldCheckSwitchCaseInProtocolData(){

        String line = "NRoC threshold = -0.20";
        ProtocolData protocolData = new ProtocolData();
        ConvertFileRowToProtocolData convert = new ConvertFileRowToProtocolData();
        convert.convert(line, protocolData);

        ProtocolData expectedProtocolData = new ProtocolData();
        expectedProtocolData.setNRoCthreshold(-0.20);

        assertEquals(expectedProtocolData, protocolData);
    }

}