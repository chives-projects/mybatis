package com.csc.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csc.mybatisplus.domain.User;
import com.csc.mybatisplus.mapper.UserMapper;
import com.csc.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 * @author csc
 * @since 2020-06-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
