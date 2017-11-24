package cn.yang.spring4.g_event.anotherEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/11/24
 */
@Component
public class TeacherCalling {

    @Autowired
    private AnnotationConfigApplicationContext context;

    public void call(AnExamination examination) {
        context.publishEvent(examination);
    }
}
