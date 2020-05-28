package org.akanami.controller;

import org.akanami.entity.User;
import org.akanami.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/get/{id}")
    public User get(@PathVariable("id") Long id) {
        return this.userMapper.getById(id);
    }

    @GetMapping("/user/update/{id}/{name}")
    public int update(@PathVariable("id") Long id, @PathVariable("name") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);

        int result = this.userMapper.updateById(user);

        return result;
    }
}
