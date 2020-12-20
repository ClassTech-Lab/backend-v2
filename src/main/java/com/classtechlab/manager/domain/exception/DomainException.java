package com.classtechlab.manager.domain.exception;

import com.classtechlab.manager.exception.ApplicationException;

public class DomainException extends ApplicationException {
    public DomainException() {
        super();
    }

    public DomainException(final String message) {
        super(message);
    }

    public DomainException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DomainException(final Throwable cause) {
        super(cause);
    }

    protected DomainException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
