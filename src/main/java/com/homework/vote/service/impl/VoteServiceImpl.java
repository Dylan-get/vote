package com.homework.vote.service.impl;

import com.homework.vote.dao.ChoicelistDao;
import com.homework.vote.dao.VotelistDao;
import com.homework.vote.pojo.entity.Choicelist;
import com.homework.vote.pojo.entity.Votelist;
import com.homework.vote.service.VoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VoteServiceImpl implements VoteService {

    @Resource
    VotelistDao votelistDao;

    @Resource
    ChoicelistDao choicelistDao;

    @Override
    public Integer voteAddService(Votelist votelist) {
        System.out.println("voteAdd");
        Integer res=votelistDao.insert(votelist);
        return res;
    }
    @Override
    public Integer voteChoiceAddService(Choicelist choicelist){
        System.out.println("voteChoiceAdd");
        Integer res=choicelistDao.insert(choicelist);
        return res;
    }
}
