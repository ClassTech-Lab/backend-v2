package com.classtechlab.manager.exception;

public class ClassTechLabManagerRuntimeException extends RuntimeException {
    public ClassTechLabManagerRuntimeException() {
        super();
    }

    public ClassTechLabManagerRuntimeException(final String message) {
        super(message);
    }

    public ClassTechLabManagerRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ClassTechLabManagerRuntimeException(final Throwable cause) {
        super(cause);
    }

    protected ClassTechLabManagerRuntimeException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
