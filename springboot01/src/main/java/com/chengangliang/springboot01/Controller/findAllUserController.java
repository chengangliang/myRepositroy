package com.chengangliang.springboot01.Controller;

import com.chengangliang.springboot01.bean.User;
import com.chengangliang.springboot01.bean.Users;
import com.chengangliang.springboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class findAllUserController {


    @Autowired
    private  UserService userService;

    @RequestMapping("/boot/findAllUsers")
    public @ResponseBody List<Users> findAllUsers(Model model){

        return userService.findAll();
    }
    @RequestMapping("/boot/updateUser")
    public @ResponseBody String updateUser(Model model){
        userService.updateUser();
        return "sss";
    }
}
