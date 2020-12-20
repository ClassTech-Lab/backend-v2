package com.classtechlab.manager.presentation.controller.exception;

import com.classtechlab.manager.presentation.exception.PresentationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends PresentationException {
    public BadRequestException() {
        super();
    }

    public BadRequestException(final String message) {
        super(message);
    }

    public BadRequestException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BadRequestException(final Throwable cause) {
        super(cause);
    }

    protected BadRequestException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
