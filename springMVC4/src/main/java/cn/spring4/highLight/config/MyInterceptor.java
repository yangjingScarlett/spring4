package cn.spring4.highLight.config;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Yangjing
 * @explain 拦截器实现对每一个请求处理前后进行相关的业务处理，类似于servlet的Filter
 * 可让普通的Bean实现HandlerInterceptor接口，或者继承HandlerInterceptorAdapter类来实现自定义拦截器
 */
public class MyInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        long startTime = (long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求的处理时间为：" + (endTime - startTime) + "ms");
        request.setAttribute("handlingTime", endTime - startTime);
    }
}
