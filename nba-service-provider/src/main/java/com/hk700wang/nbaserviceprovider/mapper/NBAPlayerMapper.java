package com.hk700wang.nbaserviceprovider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hk700wang.nbaserviceprovider.entities.NBAPlayer;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: peter
 * @Date: 2020/6/7 17:47
 * @Description: TODO(数据库操作层)
 */
@Mapper
public interface NBAPlayerMapper extends BaseMapper<NBAPlayer> {
}
