package com.csc.mybatis_springboot_xml.mapper;

import com.csc.mybatis_springboot_xml.domain.Account;
import com.csc.mybatis_springboot_xml.domain.AccountUser;

import java.util.List;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/28 22:31
 */
public interface AccountMapper {
    List<Account> findAll();
    List<AccountUser> findAllAccount();
    List<Account> findAllLazy();
    List<Account> findAccountByUid(Integer uid);
}
