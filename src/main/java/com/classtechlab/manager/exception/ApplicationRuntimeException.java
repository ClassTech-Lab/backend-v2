package com.classtechlab.manager.exception;

public class ApplicationRuntimeException extends RuntimeException {
    public ApplicationRuntimeException() {
        super();
    }

    public ApplicationRuntimeException(final String message) {
        super(message);
    }

    public ApplicationRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ApplicationRuntimeException(final Throwable cause) {
        super(cause);
    }

    protected ApplicationRuntimeException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
