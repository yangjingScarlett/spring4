package cn.yang.spring4.b_aop;

import org.springframework.stereotype.Service;

/**
 * @author Yangjing
 *         <p>
 *         基于方法规则的拦截
 */
@Service
public class MethodService {
    public void add() {
        System.out.println("add 一个方法规则式拦截！");
    }
}
