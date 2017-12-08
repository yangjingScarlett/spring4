package springHighSubject.g_runtimeInjectionProperty;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangjing on 2017/12/7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ExpressiveConfig.class, ValueConfig.class, ComponentScanConfig.class})
@Slf4j
public class InjectionPropertyTest {

    @Autowired
    private BlankDisc blankDisc;
    @Autowired
    private BlankDisc blankDisc2;
    @Autowired
    private ComponentDisc componentDisc;
    @Autowired
    private BlankDisc blankDisc3_3;

    @Test
    public void environmentTest() {
        log.info("id:{}", blankDisc.getId());
        log.info("title:{}", blankDisc.getTitle());
        log.info("artist:{}", blankDisc.getArtist());
        for (String song : blankDisc.getSongs()) {
            log.info("song:{}", song);
        }
    }

    @Test
    public void valueTest() {
        log.info("id:{}", blankDisc2.getId());
        log.info("title:{}", blankDisc2.getTitle());
        log.info("artist:{}", blankDisc2.getArtist());
    }

    @Test
    public void componentScanTest() {
        log.info("id:{}", componentDisc.getId());
        log.info("title:{}", componentDisc.getTitle());
        log.info("artist:{}", componentDisc.getArtist());
    }

    @Test
    public void injectToConfigTest() {
        log.info("id:{}", blankDisc3_3.getId());
        log.info("title:{}", blankDisc3_3.getTitle());
        log.info("artist:{}", blankDisc3_3.getArtist());
    }

}
