package cn.yang.spring4.b_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain 两种方式的切面：注解式和方法规则式
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        MethodService methodService = context.getBean(MethodService.class);

        System.out.println("------------------------------------------");
        annotationService.add();
        System.out.println("------------------------------------------");


        System.out.println("------------------------------------------");
        methodService.add();
        System.out.println("------------------------------------------");

        context.close();
    }
}
