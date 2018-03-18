package com.plivo.exception;

public class ContactDaoException extends Exception {

    public ContactDaoException(final String message) {
        super(message);
    }

    public ContactDaoException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
