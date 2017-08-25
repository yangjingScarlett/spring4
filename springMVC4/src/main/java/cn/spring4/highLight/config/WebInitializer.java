package cn.spring4.highLight.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * @author Yangjing
 */
public class WebInitializer implements WebApplicationInitializer {//WebApplicationInitializer是spring用来配置spring3+配置的接口，用来替代web.xml.
    // 实现此接口会自动被SpringServletContainerInitializer（用来启动servlet3.0容器）获取到。

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MyMvcConfig.class);
        ctx.setServletContext(servletContext);//创建WebApplicationContext,注册配置类。并将其和当前的servletContext相关

        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));//注册springMVC的DispatcherServlet
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);

    }
}
