package cn.spring4.highLight.controller;

import cn.spring4.highLight.model.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yangjing
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomthing(@ModelAttribute("msg") String msg, DemoObj obj){
        throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute:"+msg);
    }
}
