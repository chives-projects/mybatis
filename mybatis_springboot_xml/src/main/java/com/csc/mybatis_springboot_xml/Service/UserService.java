package com.csc.mybatis_springboot_xml.Service;

import com.csc.mybatis_springboot_xml.domain.User;
import com.csc.mybatis_springboot_xml.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/27 22:30
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Transactional
    public User findById(Integer id){
        User user1 = userMapper.findById(1);
        System.out.println(user1);


        User user2 = userMapper.findById(1);
        System.out.println(user2);

        System.out.println(user1 == user2);
        return user2;
    }

}
