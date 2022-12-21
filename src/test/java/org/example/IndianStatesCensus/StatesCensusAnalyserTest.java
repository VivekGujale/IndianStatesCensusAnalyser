package org.example.IndianStatesCensus;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.example.IndianStatesCensus.Constants.CSV_FILE_PATH;
import static org.junit.Assert.*;

public class StatesCensusAnalyserTest {

    @Test
    public void givenNumberOfRecord_WhenCompared_ThenShouldMatch() throws IOException, StatesCensusAnalyserException {
        StatesCensusAnalyser stateCensusAnalyser = new StatesCensusAnalyser(CSV_FILE_PATH);
        Assert.assertEquals(28, stateCensusAnalyser.load());
    }
}