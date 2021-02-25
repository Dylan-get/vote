package com.homework.vote.dao;

import com.homework.vote.pojo.entity.Votelog;

public interface VotelogDao {
    int deleteByPrimaryKey(Integer logid);

    int insert(Votelog record);

    int insertSelective(Votelog record);

    Votelog selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(Votelog record);

    int updateByPrimaryKey(Votelog record);
}