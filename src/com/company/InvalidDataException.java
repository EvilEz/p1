package com.company;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String massage) {
        super(massage);
    }
}
