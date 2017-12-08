package cn.yang.spring4.h_aopTest.impl;


import cn.yang.spring4.h_aopTest.Quest;
import org.springframework.stereotype.Component;

/**
 * Created by yangjing on 2017/12/6
 */
@Component
public class RescuingPrincessQuest implements Quest {

    public String embark(int count) {
        String str = "执行第" + count + "个任务！";
        return str;
    }
}
