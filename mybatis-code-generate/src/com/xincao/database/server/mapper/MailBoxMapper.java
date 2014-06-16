package com.xincao.database.server.mapper;

import com.xincao.database.server.model.MailBox;

public interface MailBoxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MailBox record);

    int insertSelective(MailBox record);

    MailBox selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MailBox record);

    int updateByPrimaryKey(MailBox record);
}