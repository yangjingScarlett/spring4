package cn.yang.spring4.f_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain profile：可以实现在不同的环境下使用不同的配置
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();//此时这里先不要载入ProfileConfig.class，因为要先设置环境配置
        context.getEnvironment().setActiveProfiles("dev");//先将活动的profile设为prod
        context.register(ProfileConfig.class);//后置注册Bean配置类，不然会报Bean未定义的错误
        context.refresh();//刷新容器

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }
}
