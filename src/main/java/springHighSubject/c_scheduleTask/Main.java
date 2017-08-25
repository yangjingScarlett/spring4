package springHighSubject.c_scheduleTask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain 从spring3.1开始，计划任务的执行变得简单。
 *           在配置类上添加注解@EnableScheduling来开启对计划任务的支持，
 *           在执行计划任务的方法上注解@Scheduled，声明这是个计划任务，然后配置@Scheduled的属性来确定执行任务的时间
 *
 *           可以看到在我们的main方法里面并没有调用任何的方法，程序却能够自动进行，这就是计划任务的功能了
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleTaskConfig.class);
    }
}
