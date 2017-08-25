package cn.spring4.highLight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yangjing
 */
@Controller
public class HelloController {
    //在配置中重写addViewControllers方法能得到一样的效果
    @RequestMapping("/")
    public String hello() {
        return "index";
    }
}
