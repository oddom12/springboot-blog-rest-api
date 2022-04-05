package com.springboot.blog.payload;

import java.util.Date;

/**
 * Created by user on 4/5/2022.
 */
public class ErrorDetails {


    private Date timestamp ;
    private String message ;
    private String details ;

  public   ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
