package cn.bdqn.dao;

import org.apache.ibatis.annotations.Param;
import cn.bdqn.pojo.User;

public interface UserMpper {

    public User findUser(@Param("user")User User);

}
