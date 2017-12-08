package cn.yang.spring4.h_aopTest;

import cn.yang.spring4.h_aopTest.impl.BraveKnight;
import cn.yang.spring4.h_aopTest.impl.RescuingPrincessQuest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.*;

/**
 * Created by yangjing on 2017/12/6
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)//加载上下文
@Slf4j
public class BraveKnightTest {

    @Autowired
    private BraveKnight braveKnight;

    @Test
    public void braveKnightEmbarkOnQuest() {
        log.info(braveKnight.embark(2));
        log.info(braveKnight.embark(2));
        log.info(braveKnight.embark(1));
        log.info(braveKnight.embark(1));
        log.info(braveKnight.embark(7));
    }

    @Test
    public void test1() {
        Quest mockQuest = mock(RescuingPrincessQuest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embark(1);
        verify(mockQuest, times(1)).embark(1);
    }
}
