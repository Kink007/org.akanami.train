package org.akanami.mybatisgenerator.controller;

import org.akanami.mybatisgenerator.dao.UserMapper;
import org.akanami.mybatisgenerator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        User user = this.userMapper.selectByPrimaryKey(id);

        return user;
    }
}
