package com.hk700wang.nbaserviceprovider.base.message.exception.expand;

import com.hk700wang.nbaserviceprovider.base.message.enums.ResponseCode;
import com.hk700wang.nbaserviceprovider.base.message.exception.GlobalException;

public class WeathertopAccountException extends GlobalException {

    public WeathertopAccountException(){
        super(ResponseCode.AUTHENTICATION_FAILED_ERROR.getMsg(), ResponseCode.AUTHENTICATION_FAILED_ERROR.getCode());
    }

    public WeathertopAccountException(String message, int code) {
        super(message, code);
    }

    public WeathertopAccountException(String message){
        super(message, ResponseCode.AUTHENTICATION_FAILED_ERROR.getCode());
    }
}