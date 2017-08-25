package cn.yang.spring4.b_aop;

import java.lang.annotation.*;

/**
 * @author Yangjing
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
