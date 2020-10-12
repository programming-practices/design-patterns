package com.trl.chapter_8.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecurityFilter implements Filter {
    @SuppressWarnings("unused")
    private FilterConfig filterConfig = null;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println(request.getRemoteAddr());
        // perform some security check
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() {

    }
}