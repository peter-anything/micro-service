package com.hk700wang.nbaserviceprovider.controller;

import com.hk700wang.nbaserviceprovider.base.message.response.ResponseResult;
import com.hk700wang.nbaserviceprovider.entities.NBAPlayer;
import com.hk700wang.nbaserviceprovider.service.NBAPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: peter
 * @Date: 2020/6/7 17:52
 * @Description:
 */
@RestController
@RequestMapping("/nbaplayer")
public class NBAPlayerController {
    @Autowired
    private NBAPlayerService nbaPlayerService;

    @RequestMapping("/list")
    public ResponseResult list() {
        ResponseResult response = new ResponseResult();
        List<NBAPlayer> list = nbaPlayerService.getAll();
        response.setData(list);
        return response;
    }
}

