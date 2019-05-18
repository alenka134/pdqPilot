package com.mes.pdq.pilot.modules;

import lombok.Data;

@Data
public class ProtocolData {
    private Integer SerialNumber;
    private String ProtocolName;
    private Integer BlockTemp;
    private Integer TestDuration;
    private Integer BlankFilter;
    private Integer BaseLineFilter;
    private Double GradientFilter;
    private Double PRoCthreshold;
    private Double NRoCthreshold;

}
