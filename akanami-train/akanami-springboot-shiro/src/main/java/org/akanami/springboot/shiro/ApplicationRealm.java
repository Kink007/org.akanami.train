package org.akanami.springboot.shiro;

import org.akanami.springboot.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        authorizationInfo.addRoles(userService.getRoles());
        authorizationInfo.addStringPermissions(userService.getPermissions());

        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo("admin", "admin", this.getName());

        return authenticationInfo;
    }
}
