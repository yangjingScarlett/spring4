package cn.yang.spring4.g_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Yangjing
 */
@Component
class DemoPublisher {
    @Autowired
    private ApplicationContext applicationContext;//注入ApplicationContext用来发布事件

    void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));//使用ApplicationContext的publishEvent方法来发布事件
    }


}
