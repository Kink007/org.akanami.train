package org.akanami.springboot.service.impl;

import org.akanami.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    public ArrayList<String> getRoles() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("admin_role");

        return list;
    }

    public ArrayList<String> getPermissions() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("admin_permission");

        return list;
    }
}
