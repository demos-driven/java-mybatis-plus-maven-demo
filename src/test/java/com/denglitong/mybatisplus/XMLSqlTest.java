package com.denglitong.mybatisplus;

import com.denglitong.mybatisplus.quickstart.entity.User;
import com.denglitong.mybatisplus.quickstart.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 邓礼桐（denglitong.dlt@alibaba-inc.com）
 * @date 2021/4/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class XMLSqlTest {

	@Resource
	private UserMapper userMapper;

	@Test
	void testListByAge() {
		List<User> userList = userMapper.listByAge(24);
		userList.forEach(System.out::println);
	}
}
