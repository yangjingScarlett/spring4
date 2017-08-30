package cn.spring4.highLight.controller;

import cn.spring4.highLight.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yangjing
 */
@Controller
public class NormalController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/normal")
    public String testNormal(Model model) {
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }
}
