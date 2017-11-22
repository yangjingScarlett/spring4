package cn.yang.spring4.b_aop;

import org.springframework.stereotype.Service;

/**
 * @author Yangjing
 * <p>
 * 基于注解的拦截
 */
@Service
public class AnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("add 一个注解式拦截！");
    }
}
