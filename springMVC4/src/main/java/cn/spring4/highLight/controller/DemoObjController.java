package cn.spring4.highLight.controller;

import cn.spring4.highLight.model.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Yangjing
 */
@Controller
@RequestMapping("/test")
public class DemoObjController {
    @RequestMapping(value = "/url", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
//此时放在返回类型前面
    String index(HttpServletRequest request) {//演示可接受HttpServletRequest作为参数，当然也能接受HttpServletResponse作为参数。
        return "url:" + request.getRequestURL() + " can access";
    }

    @RequestMapping(value = "/pathVar/{str}", produces = "text/plain;charset=UTF-8")//演示接受路径参数。
    public
    @ResponseBody
    String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access. str:" + str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")//演示request参数获取。访问路径为/test/requestParam?id=1
    public
    @ResponseBody
    String demoRequestParam(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access. id:" + String.valueOf(id);
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")//演示解释参数到对象。访问路径为/text/obj?id=1&name=xx
    @ResponseBody
    public String demoObj(DemoObj obj, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access. obj.id:" + obj.getId() + " obj.name:" + obj.getName();
    }

    @RequestMapping(value = {"name1", "name2"}, produces = "text/plain;charset=UTF-8")//演示映射不同的路径到相同的方法
    public
    @ResponseBody
    String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }
}
