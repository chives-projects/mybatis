package com.csc.mybatis_springboot_xml;

import com.csc.mybatis_springboot_xml.domain.Account;
import com.csc.mybatis_springboot_xml.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/28 22:32
 */
@SpringBootTest
@MapperScan("com.csc.mybatis_springboot_xml.mapper")
public class AccountTest {
    @Autowired
    AccountMapper accountMapper;
    @Test
    void findAll() {
//        accountMapper.findAll().forEach(account -> System.out.println(account));
        accountMapper.findAllLazy().forEach(account -> {
            System.out.println(account);
        });
    }
    @Test
    void findAllLazy(){
        List<Account> accounts= accountMapper.findAllLazy();
//        for(Account account : accounts){
//            System.out.println("--------每个account的信息------------");
//            System.out.println(account);
//            System.out.println(account.getUser());
//        }
    }



}
