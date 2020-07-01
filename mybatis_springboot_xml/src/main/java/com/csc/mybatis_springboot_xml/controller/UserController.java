package com.csc.mybatis_springboot_xml.controller;

import com.csc.mybatis_springboot_xml.Service.UserService;
import com.csc.mybatis_springboot_xml.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/29 14:42
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/findById")
//    @Transactional
    User findById(Integer id){
//        User user1 = userService.findById(1);
//        System.out.println(user1);
//
//
//        User user2 = userService.findById(1);
//        System.out.println(user2);
//
//        System.out.println(user1 == user2);

        return userService.findById(1);
    }


}
