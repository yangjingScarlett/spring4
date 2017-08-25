package springHighSubject.c_scheduleTask;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Yangjing
 */
@Configuration
@ComponentScan("springHighSubject/c_scheduleTask")
@EnableScheduling//开启对计划任务的支持
public class ScheduleTaskConfig {
}
