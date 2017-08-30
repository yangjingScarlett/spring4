import cn.spring4.highLight.config.MyMvcConfig;
import cn.spring4.highLight.service.DemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Yangjing
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")//用来声明加载的类的ApplicationContext是一个WebApplicationContext，它的属性指定的是web资源的位置
public class TestControllerIntegrationTests {

    private MockMvc mockMvc;//模拟MVC对象

    @Autowired
    private DemoService demoService;//可以在测试用例中注入spring的bean

    @Autowired
    private WebApplicationContext wac;//注入WebApplicationContext

    @Autowired
    private MockHttpSession session;//注入http session，这里仅做模拟，并没有使用

    @Autowired
    private MockHttpServletRequest request;//注入http request，这里仅做演示，没有使用

    @Before//在测试开始前的初始化工作
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void normalControllers() throws Exception {
        mockMvc.perform(get("/normal"))//模拟向normal进行get请求
                .andExpect(status().isOk())//预期控制返回状态为200
                .andExpect(view().name("page"))//预期view的名称为page
                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))//预期页面转向的真正路径为/WEB-INF/classes/views/page.jsp
                .andExpect(model().attribute("msg", demoService.saySomething()));//预期model里的值是demoService.saySomething()的返回值
    }

    @Test
    public void restControllers() throws Exception {
        mockMvc.perform(get("/testRest"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))//预期返回值的媒体类型
                .andExpect(content().string(demoService.saySomething()));//预期返回值的内容
    }

}
