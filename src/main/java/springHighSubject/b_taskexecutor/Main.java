package springHighSubject.b_taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain spring 通过任务执行器（TaskExecutor）来实现多线程和并发编程。使用ThreadPoolTaskExecutor可以实现一个基于线程池的TaskExecutor
 *           在配置类中添加注解@EnableAsync来开启异步任务支持，同时在实际执行的Bean的方法上添加@Async来指定这个方法是个异步方法
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        //运行可以看到，线程是并发执行的而不是顺序执行
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();
    }
}
