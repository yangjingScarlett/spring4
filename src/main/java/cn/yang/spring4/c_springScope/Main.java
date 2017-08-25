package cn.yang.spring4.c_springScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain spring4中的bean创建时，其实例的产生方式及作用范围：
 *          singleton（默认）：只创建一个实例，全容器共享同一个实例
 *          prototype：每次调用都新建一个bean的实例
 *          request：web项目中，给每一个http request新建一个bean的实例
 *          session：web项目中，给每一个http session新建一个bean的实例
 *          globalSession：只在portal项目中有用，给每一个global http session新建一个bean的实例
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        SingletonService singletonService1 = context.getBean(SingletonService.class);
        SingletonService singletonService2 = context.getBean(SingletonService.class);

        PrototypeService prototypeService1 = context.getBean(PrototypeService.class);
        PrototypeService prototypeService2 = context.getBean(PrototypeService.class);

        System.out.println("两个SingletonService实例是否相等：" + singletonService1.equals(singletonService2));
        System.out.println("两个PrototypeService实例是否相等：" + prototypeService1.equals(prototypeService2));
    }
}
