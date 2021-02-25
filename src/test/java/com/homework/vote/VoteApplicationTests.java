package com.homework.vote;

import com.homework.vote.dao.UserDao;
import com.homework.vote.dao.VotelistDao;
import com.homework.vote.dao.VotelogDao;
import com.homework.vote.pojo.entity.Votelist;
import com.homework.vote.pojo.entity.Votelog;
import com.homework.vote.service.VoteService;
import com.homework.vote.service.impl.VoteServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class VoteApplicationTests {


    @Resource
    UserDao userDao;
    @Resource
    VotelogDao votelogDao;
    @Autowired
    VoteServiceImpl voteService;


    @Test
    void contextLoads() {

        Votelog votelog=new Votelog();
        votelog.setUserid(1);
        votelog.setVoteid(4);
        votelog.setChoicename("捌佰");
        voteService.userVote(votelog);
    }

}
