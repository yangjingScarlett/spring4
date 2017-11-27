package cn.spring4.highLight.controller;

import cn.spring4.highLight.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangjing
 */
@RestController
public class TestRestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody//在类注释是*@RestController*时，这句可以不写，返回的结果都是String而不是页面
    String testRest() {
        return demoService.saySomething();
    }
}
