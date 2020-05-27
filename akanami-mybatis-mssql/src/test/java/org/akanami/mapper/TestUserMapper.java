package org.akanami.mapper;

import org.akanami.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testGetById() {
        Long id = Long.valueOf(1);
        User user = userMapper.getById(id);

        Assert.assertNotNull(user);
        Assert.assertEquals("张三", user.getName());
    }
}
