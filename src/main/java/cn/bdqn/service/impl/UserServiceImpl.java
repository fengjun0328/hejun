package cn.bdqn.service.impl;

import cn.bdqn.dao.UserMpper;
import cn.bdqn.pojo.User;
import cn.bdqn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMpper userMpper;

    @Override
    public User getUser(User user){
        return userMpper.findUser(user);
    }

}
