package com.tmall.tmallend.filter;

import com.tmall.tmallend.util.Result;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        String uri = request.getRequestURI();
        if(uri.contains(".css") || uri.contains(".js") || uri.contains(".png")|| uri.contains(".jpg")|| uri.contains(".webp")|| uri.contains(".gif")){
            //如果发现是css或者js文件，直接放行
            return true;
        }
        Object obj = request.getSession().getAttribute("userInfo");
        if(obj == null){
            String res = "请登录";
            Result data = new Result();
            PrintWriter out = response.getWriter();
            out.write(data.info(null,res));
            return false;
        }else {
            return true;
        }
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
