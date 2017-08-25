package cn.spring4.highLight.controller;

import cn.spring4.highLight.model.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yangjing
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = "application/x-wisely")
    public
    @ResponseBody
    DemoObj convert(@RequestBody DemoObj obj) {
        return obj;
    }
}
