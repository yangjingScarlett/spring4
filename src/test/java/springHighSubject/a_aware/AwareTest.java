package springHighSubject.a_aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/11/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AwareConfig.class})
@ActiveProfiles("prod")
public class AwareTest {

    @Autowired
    private AwareService awareService;

    @Test
    public void awareTest(){
        awareService.outputResult();
    }
}
