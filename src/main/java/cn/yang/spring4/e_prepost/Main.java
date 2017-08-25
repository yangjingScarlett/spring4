package cn.yang.spring4.e_prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain 对spring生命周期的操作。
 *           用两种方式实现：java配置方式：用@Bean的initMethod和destroyMethod
 *                           注解方式：JSR250的@PostConstruct和@PreDestroy
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrepostConfig.class);
        BeanWayService beanWayService=context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService=context.getBean(JSR250WayService.class);

        context.close();
    }
}
