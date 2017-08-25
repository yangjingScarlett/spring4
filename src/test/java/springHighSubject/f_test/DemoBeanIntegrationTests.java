package springHighSubject.f_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Yangjing
 */
@RunWith(SpringJUnit4ClassRunner.class)//在Junit环境下提供spring Testcontext Framework的功能
@ContextConfiguration(classes = {TestConfig.class})//用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ActiveProfiles("prod")//声明互动的profile
public class DemoBeanIntegrationTests {
    @Autowired//注入Bean
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expect = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expect, actual);//用Junit的Assert来判断结果和预期是否一致
    }
}
