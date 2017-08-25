package cn.yang.spring4.e_prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yangjing
 */
@Configuration
@ComponentScan("cn.yang.spring4.e_prepost")
public class PrepostConfig {
    @Bean(initMethod = "init",destroyMethod = "destory")//对应BeanWayService里的init(),destory()
    public BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
