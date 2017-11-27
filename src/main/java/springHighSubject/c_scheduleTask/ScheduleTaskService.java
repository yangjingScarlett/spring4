package springHighSubject.c_scheduleTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yangjing
 */
@Service
public class ScheduleTaskService {
    private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
    public void printCurTime() {
        System.out.println("当前时间是:" + timeFormat.format(new Date()));
    }

    @Scheduled(cron = "0 19 9 ? * *")//使用cron属性可以在指定时间执行，这里是每天的9点19分
    public void fixTimeExecution() {
        System.out.println("在指定时间" + timeFormat.format(new Date()) + "执行");
    }

}
