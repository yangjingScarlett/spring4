package springHighSubject.d_conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain 在profile那一节，我们知道了根据活动的profile可以创建不同的bean
 *           而spring4提供了一种更普遍的根据条件创建bean的注解，就是@conditional
 *           只有在满足@conditional的条件的时候，对应的bean才会被创建
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + " 系统下的列表命令为：" + listService.showListCmd());
    }
}
