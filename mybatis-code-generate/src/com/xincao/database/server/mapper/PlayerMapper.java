package com.xincao.database.server.mapper;

import com.xincao.database.server.model.Player;

public interface PlayerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);
}