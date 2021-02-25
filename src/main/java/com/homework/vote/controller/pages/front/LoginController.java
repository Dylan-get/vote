package com.homework.vote.controller.pages.front;

import com.homework.vote.dao.UserDao;
import com.homework.vote.pojo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/pages/front/login")
public class LoginController {

    @Resource
    UserDao userDao;

    @RequestMapping("/loginpage")
    String loginPage(Map<String,Object> map){
        return "pages/front/login/loginpage";
    }
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password , Map<String ,Object> map, HttpSession session){

        User user = userDao.selectByUserName(username);
        String passwd=user.getPasswd();
        System.out.println(passwd);
        if(!StringUtils.isEmpty(username)&& passwd.equals(password)){
            System.out.println(1);
            session.setAttribute("loginUser",username);
            System.out.println(2);
            return "redirect:/vote/success";
        }else {
            //登陆失败
            map.put("msg","用户密码错误");
            return "/pages/front/login/loginpage";
        }
    }
}
