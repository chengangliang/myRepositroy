package com.chengangliang.springboot01.Controller;

import com.chengangliang.springboot01.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${boot.name}")
    private String name;
    @Value("${boot.age}")
    private String age;
    @Autowired
    private User user;

    @RequestMapping("/boot/hello")
    public @ResponseBody User sayHello(){
        return user;
    }

    @RequestMapping("/boot/hello2")
    public @ResponseBody String sayHello2(){
        return name+age;
    }
  /*  @PostMapping("/boot/hello3")
    public @ResponseBody User sayHello3(){
        return user;
    }*/

   @RequestMapping("/boot/hello3")
    public String sayHello3(Model model){
       model.addAttribute("msg", "涛狗是猪");

        return "index";
    }
    @RequestMapping("/boot/hello4")
    public String sayHello4(Model model){
        model.addAttribute("msg", "涛狗是猪");

        return "jsp/index";
    }
}
