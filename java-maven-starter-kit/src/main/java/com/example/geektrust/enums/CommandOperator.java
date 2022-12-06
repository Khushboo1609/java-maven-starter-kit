package com.example.geektrust.enums;

public enum CommandOperator {
    BALANCE(2),
    CHECK_IN(3),
    PRINT_SUMMARY(0);

    CommandOperator(Integer numArgs){
        this.numberOfArguments = numArgs;
    }

    private final Integer numberOfArguments;

    public Integer getNumberOfArguments() {
        return numberOfArguments;
    }
}
