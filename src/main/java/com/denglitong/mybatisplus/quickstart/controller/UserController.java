package com.denglitong.mybatisplus.quickstart.controller;


import com.denglitong.mybatisplus.quickstart.entity.User;
import com.denglitong.mybatisplus.quickstart.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 邓礼桐（deng.litong@foxmail.com）
 * @since 2021-04-02
 */
@RestController
@RequestMapping("/quickstart/user")
public class UserController {

	@Resource
	private IUserService userService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<User> list() {
		return userService.list();
	}
}

