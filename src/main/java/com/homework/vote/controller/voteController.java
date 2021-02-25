package com.homework.vote.controller;

import com.homework.vote.dao.ChoicelistDao;
import com.homework.vote.dao.UserDao;
import com.homework.vote.dao.VotelistDao;
import com.homework.vote.pojo.entity.Choicelist;
import com.homework.vote.pojo.entity.User;
import com.homework.vote.pojo.entity.Votelist;
import com.homework.vote.pojo.entity.Votelog;
import com.homework.vote.service.VoteService;
import com.homework.vote.service.impl.VoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/vote")
public class voteController {

    @Resource
    UserDao userDao;

    @Autowired
    VoteServiceImpl voteService;

    @Resource
    ChoicelistDao choicelistDao;

    @ResponseBody
    @RequestMapping("/success")
    String vote(){

        return "进入投票界面";
    }

    @ResponseBody
    @RequestMapping("/voteAdd")
    String voteAdd(HttpServletRequest request, String votename){
        Object user=request.getSession().getAttribute("loginUser");
        String username=user.toString();
        User user1=userDao.selectByUserName(username);
        Integer userid=user1.getUserid();
        Votelist votelist=new Votelist();
        votelist.setVotename(votename);
        votelist.setUserid(userid);
        if(voteService.voteAddService(votelist)>0)
        {return "创建vote成功";} else{
            return "创建vote失败";
        }


    }

    @ResponseBody
    @RequestMapping("/voteChoiceAdd")
    String voteChoiceAdd(String choiceName,Integer voteid){
        Choicelist choicelist=new Choicelist();
        choicelist.setChoicename(choiceName);
        choicelist.setNum(0);
        choicelist.setVoteid(voteid);
        if(voteService.voteChoiceAddService(choicelist)>0){
            return "增加vote选项成功";
        }else {
            return "增加vote选项失败";
        }

    }
    @ResponseBody
    @RequestMapping("/user")
    String userVote(HttpServletRequest request,String choiceName,Integer voteid){
        Object user=request.getSession().getAttribute("loginUser");
        String username=user.toString();
        User user1=userDao.selectByUserName(username);
        Integer userid=user1.getUserid();
        Votelog votelog=new Votelog();
        votelog.setUserid(userid);
        votelog.setVoteid(voteid);
        votelog.setChoicename(choiceName);

        if(voteService.userVote(votelog)){

            return "投票成功";
        }else {
            return "投票失败";
        }

    }
}
