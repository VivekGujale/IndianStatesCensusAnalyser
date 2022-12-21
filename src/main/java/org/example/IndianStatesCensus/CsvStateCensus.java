package org.example.IndianStatesCensus;

import com.opencsv.bean.CsvBindByName;

public class CsvStateCensus {

    @CsvBindByName(column = "SrNo")
    private int srNo;
    @CsvBindByName(column = "StateName")
    private String stateName;
    @CsvBindByName(column = "TIN")
    private int tin;
    @CsvBindByName(column = "StateCode")
    private String stateCode;
    private final String filename;

    public CsvStateCensus(String filename) {
        this.filename = filename;
    }

}
