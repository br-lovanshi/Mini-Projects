package com.exception;

public class StudentException extends Exception {
    private final int statusCode;
    public StudentException(int statusCode, String ex){
         super(ex);
         this.statusCode = statusCode;
    }
    public int getStatusCode(){
        return this.statusCode;
    }
}
