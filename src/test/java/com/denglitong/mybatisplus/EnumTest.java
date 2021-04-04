package com.denglitong.mybatisplus;

import com.denglitong.mybatisplus.quickstart.entity.User;
import com.denglitong.mybatisplus.quickstart.entity.enums.GradeEnum;
import com.denglitong.mybatisplus.quickstart.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author denglitong
 * @date 2021/4/4
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class EnumTest {

    @Resource
    private UserMapper userMapper;

    @Test
    void testUpdate() {
        User user = userMapper.selectById(5);
        user.setGrade(GradeEnum.HIGH);
        Assertions.assertTrue(userMapper.updateById(user) > 0);
    }

    @Test
    void testList() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
