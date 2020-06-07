package com.hk700wang.nbaserviceprovider.base.message.exception.expand;


import com.hk700wang.nbaserviceprovider.base.message.enums.ResponseCode;
import com.hk700wang.nbaserviceprovider.base.message.exception.GlobalException;

public class ParamException extends GlobalException {

    public ParamException(String message){
        super(message, ResponseCode.PARAM_ERROR_CODE.getCode());
    }
}
