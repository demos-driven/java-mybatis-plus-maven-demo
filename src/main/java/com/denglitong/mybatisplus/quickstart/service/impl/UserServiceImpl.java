package com.denglitong.mybatisplus.quickstart.service.impl;

import com.denglitong.mybatisplus.quickstart.entity.User;
import com.denglitong.mybatisplus.quickstart.mapper.UserMapper;
import com.denglitong.mybatisplus.quickstart.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 邓礼桐（deng.litong@foxmail.com）
 * @since 2021-04-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
