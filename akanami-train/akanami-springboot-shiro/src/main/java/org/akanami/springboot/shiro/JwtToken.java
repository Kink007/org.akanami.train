package org.akanami.springboot.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    public Object getPrincipal() {
        return this.token;
    }

    public Object getCredentials() {
        return this.token;
    }
}
