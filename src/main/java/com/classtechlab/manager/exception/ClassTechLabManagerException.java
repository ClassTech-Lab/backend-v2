package com.classtechlab.manager.exception;

public class ClassTechLabManagerException extends Exception {
    public ClassTechLabManagerException() {
        super();
    }

    public ClassTechLabManagerException(final String message) {
        super(message);
    }

    public ClassTechLabManagerException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ClassTechLabManagerException(final Throwable cause) {
        super(cause);
    }

    protected ClassTechLabManagerException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
