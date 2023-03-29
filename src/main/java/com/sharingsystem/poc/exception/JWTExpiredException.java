package com.sharingsystem.poc.exception;

public class JWTExpiredException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JWTExpiredException() {
        super();
    }

    public JWTExpiredException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public JWTExpiredException(final String message) {
        super(message);
    }

    public JWTExpiredException(final Throwable cause) {
        super(cause);
    }

}
