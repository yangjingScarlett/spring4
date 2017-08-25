package cn.yang.spring4.d_el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain spring表达式语言：用@Value实现资源的注入：包括普通字符，网址，文件，属性文件等
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();

        context.close();
    }
}
