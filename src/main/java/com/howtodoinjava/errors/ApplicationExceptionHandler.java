package com.howtodoinjava.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(ItemNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String itemNotFoundHandler(ItemNotFoundException ex) {
        return ex.getMessage();
    }
}

