package com.classtechlab.manager.presentation.controller.exception;

import com.classtechlab.manager.presentation.exception.PresentationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends PresentationException {
    public NotFoundException() {
        super();
    }

    public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(final Throwable cause) {
        super(cause);
    }

    protected NotFoundException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
