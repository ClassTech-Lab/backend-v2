package com.classtechlab.manager.presentation.exception;

import com.classtechlab.manager.exception.ClassTechLabManagerRuntimeException;

public class PresentationException extends ClassTechLabManagerRuntimeException {
    public PresentationException() {
        super();
    }

    public PresentationException(final String message) {
        super(message);
    }

    public PresentationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PresentationException(final Throwable cause) {
        super(cause);
    }

    protected PresentationException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
