package cn.yang.spring4.g_event.anotherEvent;

import org.springframework.context.ApplicationEvent;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/11/24
 */
public class AnExamination extends ApplicationEvent {

    private String name;
    private String score;

    public AnExamination(Object source, String name, String score) {
        super(source);
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
