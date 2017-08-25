package cn.yang.spring4.g_event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Yangjing
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUid = 1;
    private String msg;

    //这是一个重写的方法，不然会报错
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
