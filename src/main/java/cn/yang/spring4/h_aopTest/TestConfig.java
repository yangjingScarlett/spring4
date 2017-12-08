package cn.yang.spring4.h_aopTest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by yangjing on 2017/12/6
 */
@Configuration
@ComponentScan("cn.yang.spring4.h_aopTest")
@EnableAspectJAutoProxy
public class TestConfig {

}
