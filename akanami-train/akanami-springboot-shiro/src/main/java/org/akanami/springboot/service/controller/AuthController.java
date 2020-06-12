package org.akanami.springboot.service.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequiresPermissions({"admin_permission_haha"})
    @GetMapping("/require")
    public String require() {
        return "hello, this is require method";
    }

    @GetMapping("/norequire")
    public String norequire() {
        return "hello, this is no require method, you can access without auth";
    }
}
