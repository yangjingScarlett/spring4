package cn.spring4.highLight.controller;

import cn.spring4.highLight.model.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangjing
 */
@RestController
@RequestMapping("/reTest")
public class DemoObjRestController {

    //访问路径：http://localhost:8080/reTest/obj?serial=1&id_string=1&name=xx
    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    public DemoObj getJson(DemoObj obj) {
        return new DemoObj(1L, obj.getId_string() + "1", obj.getName() + "yy");
    }

    //访问路径：http://localhost:8080/reTest/xml?serial=1&id_string=1&name=xx
    //这里其实有问题，会报406错误
    @RequestMapping(value = "/xml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getXml(DemoObj obj) {
        return new DemoObj(1L, obj.getId_string() + "1", obj.getName() + "yy");
    }
}
