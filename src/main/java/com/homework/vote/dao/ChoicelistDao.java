package com.homework.vote.dao;

import com.homework.vote.pojo.entity.Choicelist;

public interface ChoicelistDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Choicelist record);

    int insertSelective(Choicelist record);

    Choicelist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Choicelist record);

    int updateByPrimaryKey(Choicelist record);
    int updateByVoteIdAndChoiceName(Integer voteid,String choicename);
}