package com.hk700wang.nbaserviceprovider.base.message.exception.expand;

import com.hk700wang.nbaserviceprovider.base.message.enums.ResponseCode;
import com.hk700wang.nbaserviceprovider.base.message.exception.GlobalException;

public class ServerException extends GlobalException {

    public ServerException(String message){
        super(message, ResponseCode.ERROR.getCode());
    }
}
