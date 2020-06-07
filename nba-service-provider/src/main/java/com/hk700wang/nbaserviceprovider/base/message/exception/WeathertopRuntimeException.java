package com.hk700wang.nbaserviceprovider.base.message.exception;


import com.hk700wang.nbaserviceprovider.base.message.enums.ResponseCode;

public class WeathertopRuntimeException  extends RuntimeException {
    private static final long serialVersionUID = -6370612186038915645L;

    private final ResponseCode response;

    public WeathertopRuntimeException(ResponseCode response) {
        this.response = response;
    }

    public ResponseCode getResponse() {
        return response;
    }
}
