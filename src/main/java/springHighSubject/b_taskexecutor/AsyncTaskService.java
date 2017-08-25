package springHighSubject.b_taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Yangjing
 */
@Service
public class AsyncTaskService {

    @Async//指明这个方法是异步方法。如果注解在类上，则该类的所有方法都是异步方法。这里方法自动被注入使用ThreadPoolTaskExecutor，作为taskExecutor
    public void executeAsyncTask(int i) {
        System.out.println("执行异步方法：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(int i) {
        System.out.println("执行异步方法+1：" + (i + 1));
    }
}
