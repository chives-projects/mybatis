package com.csc.mybatis_springboot_xml.mapper;

import com.csc.mybatis_springboot_xml.domain.Role;

import java.util.List;

/**
 * @description:
 * @author: csc
 * @create: 2020/5/28 23:09
 */
public interface RoleMapper {
    List<Role> findAll();
}
