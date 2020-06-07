package com.hk700wang.nbaserviceprovider.service.impl;

import com.hk700wang.nbaserviceprovider.entities.NBAPlayer;
import com.hk700wang.nbaserviceprovider.mapper.NBAPlayerMapper;
import com.hk700wang.nbaserviceprovider.service.NBAPlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: peter
 * @Date: 2020/6/7 17:50
 * @Description:
 */
@Service
public class NBAPlayerServiceImpl implements NBAPlayerService {
    @Resource
    private NBAPlayerMapper nbaPlayerMapper;

    @Override
    public List<NBAPlayer> getAll() {
        return nbaPlayerMapper.selectList(null);
    }

    @Override
    public void save(NBAPlayer player) {
        nbaPlayerMapper.insert(player);
    }
}
