package org.akanami.springboot.serveletfilterdemo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@Component
@WebFilter(urlPatterns = "filter/**", filterName = "consoleFilter")
public class ConsoleFilter implements Filter {
    private static final String[] excludePathPatterns = { "/filter/no" };

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("构造Filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse reps = (HttpServletResponse) servletResponse;

        String url = req.getRequestURI();
        if(Arrays.asList(excludePathPatterns).contains(url)) {
            System.out.println("不用拦截");
        } else {
            System.out.println("开始拦截了，指定自定义方法");
        }
        //继续下一个调用链
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁Filter");
    }
}
