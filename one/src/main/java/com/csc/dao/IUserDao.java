package com.csc.dao;

import com.csc.domain.User;

import java.util.List;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/27 15:37
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}