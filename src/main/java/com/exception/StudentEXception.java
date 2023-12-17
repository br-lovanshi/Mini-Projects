package com.exception;

public class StudentEXception extends Exception{
    private int statusCode = 0;

    public StudentEXception(int statusCode,String exception){
        this.statusCode = statusCode;
        System.out.println(exception);
    }

    public int getStatusCode(){
        return this.statusCode;
    }
}
