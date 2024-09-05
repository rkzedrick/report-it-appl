package com.rcts.ria.exception.domain;

public class EmailExistsException extends Exception{
    public EmailExistsException(String message) {
        super(message);
    }
}
