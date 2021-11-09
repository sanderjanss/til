package com.switchfully.til.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchTilException extends RuntimeException {

    public NoSuchTilException(String message) {
        super(message);
    }
}
