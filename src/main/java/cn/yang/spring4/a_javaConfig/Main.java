package cn.yang.spring4.a_javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain 这个包是用spring4的java配置，来替代spring3的注解配置
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);
        useFunctionService.show("JavaConfig");
        context.close();
    }
}
