package com.hk700wang.nbaserviceconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: peter
 * @Date: 2020/6/7 19:13
 * @Description:
 */
@FeignClient(name = "nba-service-provider")
public interface NBAServiceProviderClient {

    @RequestMapping(value = "/nbaplayer/list", method = RequestMethod.GET)
    String getPlayers();
}
