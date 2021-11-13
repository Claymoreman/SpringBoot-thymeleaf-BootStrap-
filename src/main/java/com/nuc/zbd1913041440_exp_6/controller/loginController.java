package com.nuc.zbd1913041440_exp_6.controller;

import com.nuc.zbd1913041440_exp_6.entity.zbdUser;
import com.nuc.zbd1913041440_exp_6.service.zbdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
public class loginController {
    @Autowired
    zbdUserService userService;

    @RequestMapping(value = "/")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/reg")
    public String register(){
        return "register";
    }

    @ResponseBody
    @RequestMapping(value = "/login")
    public String login(@RequestParam("userName")String userName,
                        @RequestParam("password")String password,
                        HttpSession session){
        String msg = "";
        zbdUser user = userService.login(userName, password);
        Integer status = user.getZbdstatus();
//        System.out.println(user);
        if (userName != null && password != null ){
            session.setAttribute("loginUser",user);
            if (user != null && status == 0){
                msg = "管理员登录成功！";
            }else if (user != null && status == 1){
                msg = "用户登录成功！";
            }else {
                msg = "用户名或密码错误！";
            }
        }
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "/register")
    public String register(@RequestParam("userName")String userName,@RequestParam("password")String password){
        String msg = "";
        Integer flag = userService.register(userName, password, 1);
        System.out.println(flag);
        if (flag == 1){
            msg = "注册成功!";
        }else {
            msg = "注册失败！";
        }
        return msg;
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
