package com.nuc.zbd1913041440_exp_6.controller;

import com.nuc.zbd1913041440_exp_6.entity.zbdBook;
import com.nuc.zbd1913041440_exp_6.entity.zbdUser;
import com.nuc.zbd1913041440_exp_6.service.zbdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @author 朱博达
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    zbdUserService userService;

    @RequestMapping("/table")
    public String userTable(Model model){
        List<zbdUser> allUsers = userService.findAllUsers();
        model.addAttribute("allUsers",allUsers);
        return "usertable";
    }

    @RequestMapping("/add")
    public String add(Model model){
        List<zbdUser> allUsers = userService.findAllUsers();
        model.addAttribute("allUsers",allUsers);
        return "user-add";
    }

    @RequestMapping("/admin-table")
    public String adminTable(Model model){
        List<zbdUser> allUsers = userService.findAllUsers();
        model.addAttribute("allUsers",allUsers);
        return "usertable-admin";
    }

    @RequestMapping("/admin-find")
    public String adminFind(@RequestParam("text")String text, Model model){
        List<zbdUser> allUsers = userService.findUser(text);
        model.addAttribute("allUsers",allUsers);
        return "usertable-admin";
    }

    @PostMapping("/insert")
    public String addBook(@RequestParam("password")String password,
                          @RequestParam("userName") String userName,
                          @RequestParam("userStatus") Integer userStatus){
        zbdUser zbdUser = new zbdUser(userName,password,userStatus);
        userService.addUser(zbdUser);
        return "redirect:/user/admin-table";
    }

    @RequestMapping("/del")
    public String delUser(@RequestParam("zbdid")Integer id){
        userService.delUser(id);
        return "redirect:/user/admin-table";
    }

    @RequestMapping("/set")
    public String setUser(@RequestParam("userid")Integer id,
                          @RequestParam("userName")String userName,
                          @RequestParam("password")String password,
                          @RequestParam("userStatus")Integer status){
        System.out.println(id);
        System.out.println(userName);
        System.out.println(password);
        zbdUser zbdUser = new zbdUser(id,userName,password,status);
        Integer flag = userService.setUser(zbdUser);
        return "redirect:/user/admin-table";
    }

}
