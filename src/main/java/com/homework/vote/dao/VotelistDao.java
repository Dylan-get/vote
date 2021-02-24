package com.homework.vote.dao;

import com.homework.vote.pojo.entity.Votelist;

public interface VotelistDao {
    int deleteByPrimaryKey(Integer voteid);

    int insert(Votelist record);

    int insertSelective(Votelist record);

    Votelist selectByPrimaryKey(Integer voteid);

    int updateByPrimaryKeySelective(Votelist record);

    int updateByPrimaryKey(Votelist record);
}