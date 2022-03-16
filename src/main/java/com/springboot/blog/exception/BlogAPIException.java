package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by user on 3/10/2022.
 */
public class BlogAPIException extends RuntimeException {

    private HttpStatus status ;
    private String message ;

    public BlogAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public BlogAPIException(String s, HttpStatus status, String message) {
        super(s);
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
