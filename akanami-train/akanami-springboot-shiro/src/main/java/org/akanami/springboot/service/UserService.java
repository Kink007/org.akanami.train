package org.akanami.springboot.service;

import java.util.ArrayList;

public interface UserService {
    ArrayList<String> getRoles();

    ArrayList<String> getPermissions();
}
