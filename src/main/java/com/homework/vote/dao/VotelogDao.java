package com.homework.vote.dao;

import com.homework.vote.pojo.entity.Votelog;

public interface VotelogDao {
    int deleteByPrimaryKey(Integer logid);

    int insert(Votelog record);

    int insertSelective(Votelog record);

    Votelog selectByPrimaryKey(Integer logid);

    Votelog selectByUseidAndVoteid(Integer userid,Integer voteid);
    int updateByPrimaryKeySelective(Votelog record);

    int updateByPrimaryKey(Votelog record);
}