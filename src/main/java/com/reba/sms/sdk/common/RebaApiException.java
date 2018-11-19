package com.reba.sms.sdk.common;

public class RebaApiException extends RebaException {

    private int code;

    public RebaApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
