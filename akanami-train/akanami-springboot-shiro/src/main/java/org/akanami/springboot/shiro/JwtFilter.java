package org.akanami.springboot.shiro;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

@Component
public class JwtFilter extends FormAuthenticationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        HttpServletRequest req = (HttpServletRequest) request;

        String uriToken = req.getParameter("token");
        if(uriToken == null) {
            String headToken = req.getHeader("Authorization");
            if(headToken == null) {
                return false;
            }
        }

        return true;
    }
//
//    @Override
//    protected boolean isLoginAttempt(ServletRequest request, ServletResponse response) {
//        HttpServletRequest req = (HttpServletRequest) request;
//
//        String uriToken = req.getParameter("token");
//        if(uriToken == null) {
//            String headToken = req.getHeader("Authorization");
//            if(headToken == null) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
