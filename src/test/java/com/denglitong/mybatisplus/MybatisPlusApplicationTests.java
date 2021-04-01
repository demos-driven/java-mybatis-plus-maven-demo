package com.denglitong.mybatisplus;

import com.denglitong.mybatisplus.samples.quickstart.mapper.User;
import com.denglitong.mybatisplus.samples.quickstart.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisPlusApplicationTests {

	@Resource
	private UserMapper userMapper;

	@Test
	void testSelect() {
		System.out.println("---- selectAll method test ----");
		List<User> userList = userMapper.selectList(null);
		Assert.assertEquals(5, userList.size());
		userList.forEach(System.out::println);
	}

}
