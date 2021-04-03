package com.denglitong.mybatisplus.quickstart.mapper;

import com.denglitong.mybatisplus.quickstart.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 邓礼桐（deng.litong@foxmail.com）
 * @since 2021-04-02
 */
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 根据年龄查询用户列表
	 *
	 * @param age
	 * @return
	 */
	List<User> listByAge(Integer age);
}
