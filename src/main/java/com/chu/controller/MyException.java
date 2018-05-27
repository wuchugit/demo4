package com.chu.controller;

public class MyException extends RuntimeException {


    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public MyException(String errorCode) {
        this.errorCode = errorCode;
    }

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public MyException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public MyException(Throwable cause, String errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    public static void main(String[] args) {
        System.out.println(1);
        throw new MyException("wuchu","1");
    }

}
