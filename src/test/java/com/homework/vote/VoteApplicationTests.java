package com.homework.vote;

import com.homework.vote.dao.UserDao;
import com.homework.vote.dao.VotelistDao;
import com.homework.vote.pojo.entity.Votelist;
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
    @Autowired
    VoteServiceImpl voteService;

    @Test
    void contextLoads() {
        String votename="书籍";
        Integer userid=23;
        Votelist votelist=new Votelist();
        votelist.setVotename(votename);
        votelist.setUserid(userid);
        voteService.voteAddService(votelist);
    }

}
