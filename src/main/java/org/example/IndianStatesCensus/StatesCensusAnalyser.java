package org.example.IndianStatesCensus;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class StatesCensusAnalyser {
    private final String fileName;

    public StatesCensusAnalyser(String fileName) {
        this.fileName = fileName;
    }

    public int load() throws IOException, StatesCensusAnalyserException {
        int counter = 0;
        try {
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CsvStateCensus.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            for (Object ignored : csvToBean) {
                counter++;
            }
        } catch (NoSuchFileException e) {
            throw new StatesCensusAnalyserException("No such file found", StatesCensusAnalyserException.TypeOfException.NO_SUCH_FILE_EXCEPTION);
        } catch (RuntimeException e) {
            throw new StatesCensusAnalyserException("No such field found", StatesCensusAnalyserException.TypeOfException.NO_SUCH_FILED_EXCEPTION);
        }
        return counter;
    }
}