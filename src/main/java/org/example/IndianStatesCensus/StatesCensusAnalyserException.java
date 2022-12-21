package org.example.IndianStatesCensus;

public class StatesCensusAnalyserException extends Exception {

    public enum TypeOfException{
        NO_SUCH_FILE_EXCEPTION,NO_SUCH_FILED_EXCEPTION;
    }

    public TypeOfException type;

    public StatesCensusAnalyserException(String message, TypeOfException type) {
        super(message);
        this.type = type;
    }
}
