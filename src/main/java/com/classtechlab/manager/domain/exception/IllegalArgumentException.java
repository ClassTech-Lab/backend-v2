package com.classtechlab.manager.domain.exception;

public class IllegalArgumentException extends DomainException {
    public IllegalArgumentException() {
        super();
    }

    public IllegalArgumentException(final String message) {
        super(message);
    }

    public IllegalArgumentException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public IllegalArgumentException(final Throwable cause) {
        super(cause);
    }

    protected IllegalArgumentException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
