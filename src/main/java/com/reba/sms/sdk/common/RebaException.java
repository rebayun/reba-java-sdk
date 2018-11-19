package com.reba.sms.sdk.common;


public class RebaException extends RuntimeException {

    public RebaException(String message) {
        super(message);
    }

    public RebaException(String message, Throwable cause) {
        super(message, cause);
    }

    public RebaException(Throwable cause) {
        super(cause);
    }

}
