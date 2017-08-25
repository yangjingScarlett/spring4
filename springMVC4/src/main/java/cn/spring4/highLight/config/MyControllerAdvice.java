package cn.spring4.highLight.config;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Yangjing
 * @explain @ControllerAdvice注解，是为了实现对容器的全局配置，也就是说将对容器的一些全局配置放在同一个位置
 *           包括：@ExceptionHandler, @InitBinder, @ModelAttribute可以注解在方法上，对于所有在注解了@RequestMapping的控制器内的方法有效
 *           1.@ExceptionHandler:全局处理控制器中的异常
 *           2.@InitBinder：用来定制WebDataBinder,WebDataBinder用来自动绑定前台请求参数到Model中
 *           3.@ModelAttribute：本来的作用是绑定键值对到Model里，此处是让全局的@RequestMapping都能获得在此处设置的键值对
 */
//@ControllerAdvice组合了@Component，所以自动注册为spring的Bean
@ControllerAdvice
public class MyControllerAdvice {

    //@ExceptionHandler在此处定义全局处理。它的value属性过滤拦截条件，此处拦截所有的Exception
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception exception, WebRequest webRequest){
        ModelAndView modelAndView=new ModelAndView("error");//这个error就对应这error.jsp
        modelAndView.addObject("errorMsg",exception.getMessage());//这里的errorMsg，就对应error.jsp中的${errorMsg}
        return modelAndView;
    }

    //将键值对添加到全局，所有注解的@RequestMapping方法都可以获得此键值对
    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("msg","额外信息");
    }

    //注解定制的WebDataBinder，此处演示为忽略request参数中的id
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");
    }

}
