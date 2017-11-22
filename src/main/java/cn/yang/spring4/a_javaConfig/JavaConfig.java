package cn.yang.spring4.a_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yangjing
 * 基于java的配置：在 @Configuration注解的类中使用 @Bean 注解到方法上
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean//基于setter方法的依赖注入
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    @Bean//基于构造函数的依赖注入
    public UseFunctionService useFunctionService(FunctionService functionService) {
        return new UseFunctionService(functionService);
    }
}
