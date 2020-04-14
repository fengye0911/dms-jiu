package cn.itsource.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description 过滤器用来解决403跨域问题
 * @Author lq
 * @Date new Date()
 * @Version v1.0
 **/

public class CorsFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String origin = req.getHeader("Origin");

        if("http://localhost:6001".equalsIgnoreCase(origin) ||"http://172.16.5.244:6001".equalsIgnoreCase(origin)){
            response.setHeader("Access-Control-Allow-Origin", origin);

        }
        response.setHeader("Allow", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", String.valueOf(20*24*60*60));
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        filterChain.doFilter(req, response);
    }

    @Override
    public void destroy() {

    }
}
