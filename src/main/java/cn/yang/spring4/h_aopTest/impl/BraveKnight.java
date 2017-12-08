package cn.yang.spring4.h_aopTest.impl;

import cn.yang.spring4.h_aopTest.Knight;
import cn.yang.spring4.h_aopTest.Poem;
import cn.yang.spring4.h_aopTest.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangjing on 2017/12/6
 */
@Component
public class BraveKnight implements Knight {
    private Quest quest;

    @Autowired
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Poem
    public String embark(int count) {
        return quest.embark(count);
    }

}
