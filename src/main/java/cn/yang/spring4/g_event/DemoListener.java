package cn.yang.spring4.g_event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Yangjing
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//实现ApplicationListener接口，并制定监听的事件类型

    //这是个重写的ApplicationListener的方法
    public void onApplicationEvent(DemoEvent event) {//使用onApplicationEvent方法对消息进行接受处理
        String msg = event.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息：" + msg);

    }

}
