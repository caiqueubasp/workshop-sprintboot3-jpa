package com.caiqueubasp.course.services.excepctions;

public class DatabaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DatabaseException(String msg) {
        super(msg);
    }

    public DatabaseException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
