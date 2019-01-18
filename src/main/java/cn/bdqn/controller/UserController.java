package cn.bdqn.controller;

import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/index.html")
    public String getLogin(@ModelAttribute User user){
        return "index";
    }

    @RequestMapping(value = "/index.html",method = RequestMethod.POST)
    public String login(User user){

        if (userService.getUser(user)!=null){
            System.out.println("登录成功!");
        }else{
            System.out.println("登录失败");
        }
    return "index";
    }
}
