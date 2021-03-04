package com.homework.vote.service.impl;

import com.homework.vote.dao.ChoicelistDao;
import com.homework.vote.dao.VotelistDao;
import com.homework.vote.dao.VotelogDao;
import com.homework.vote.pojo.entity.Choicelist;
import com.homework.vote.pojo.entity.Votelist;
import com.homework.vote.pojo.entity.Votelog;
import com.homework.vote.service.VoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VoteServiceImpl implements VoteService {

    @Resource
    VotelistDao votelistDao;

    @Resource
    ChoicelistDao choicelistDao;

    @Resource
    VotelogDao votelogDao;

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
    @Override
    public boolean userVote(Votelog votelog){


        System.out.println("Uservote");
        boolean res=true;
        //验证是否重复投票
        if(votelogDao.selectByUseidAndVoteid(votelog.getUserid(),votelog.getVoteid())!=null){
            res=false;
        }
        if(res){

            votelogDao.insert(votelog);
            System.out.println("票数+1");
            choicelistDao.updateByVoteIdAndChoiceName(votelog.getVoteid(),votelog.getChoicename());
            return true;
        }else{
            System.out.println("已经投票");
            System.out.println("userid\t");
            System.out.println(votelogDao.selectByUseidAndVoteid(votelog.getUserid(),votelog.getVoteid()).getUserid());
        return false;
        }
    }
}
