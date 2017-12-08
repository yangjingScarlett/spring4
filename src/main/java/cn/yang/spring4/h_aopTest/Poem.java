package cn.yang.spring4.h_aopTest;

import java.lang.annotation.*;

/**
 * Created by yangjing on 2017/12/6
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Poem {
    String value() default "";
}
