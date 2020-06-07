package com.hk700wang.nbaserviceprovider.service;

import com.hk700wang.nbaserviceprovider.entities.NBAPlayer;

import java.util.List;

/**
 * @Auther: peter
 * @Date: 2020/6/7 17:49
 * @Description:
 */
public interface NBAPlayerService {
    /**
     * 获取所有用户信息
     * @return
     */
    public List<NBAPlayer> getAll();

    /**
     * 添加用户
     * @param player
     */
    public void save(NBAPlayer player);
}
