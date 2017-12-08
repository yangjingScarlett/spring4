package springHighSubject.g_runtimeInjectionProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by yangjing on 2017/12/7
 */
@Configuration
@ComponentScan("springHighSubject.g_runtimeInjectionProperty")
public class ComponentScanConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
