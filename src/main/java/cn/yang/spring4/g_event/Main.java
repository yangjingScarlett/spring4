package cn.yang.spring4.g_event;

import cn.yang.spring4.g_event.anotherEvent.AnExamination;
import cn.yang.spring4.g_event.anotherEvent.TeacherCalling;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yangjing
 * @explain spring的事件（Application Event）为Bean与Bean之间的消息通信提供了支持。
 * 当一个Bean处理完一个任务之后，希望另一个Bean知道并能做相应的处理，这时就需要让另一个Bean监听当前Bean所发送的的事件。
 * spring的事件遵循如下流程：
 * 1.自定义事件，集成Application Event
 * 2.定义事件监听，实现ApplicationListener
 * 3.使用容器发布事件
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
//        DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
//        demoPublisher.publish("hello application event ! ");

        AnExamination examination = new AnExamination(TeacherCalling.class, "英语", "45");
        TeacherCalling teacherCalling = context.getBean(TeacherCalling.class);
        teacherCalling.call(examination);

        context.close();
    }
}
