package com.hk700wang.nbaserviceconsumer.controller;

import com.hk700wang.nbaserviceconsumer.client.NBAServiceProviderClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: peter
 * @Date: 2020/6/7 19:01
 * @Description:
 */
@RestController
@RequestMapping("/nba")
public class NBAController {
    @Resource
    private NBAServiceProviderClient nbaServiceProviderClient;

    @RequestMapping("/players")
    public String players() {
        return nbaServiceProviderClient.getPlayers();
    }
}
