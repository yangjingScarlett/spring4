package cn.yang.spring4.b_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Yangjing
 */
@Configuration
@ComponentScan("cn.yang.spring4.b_aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
