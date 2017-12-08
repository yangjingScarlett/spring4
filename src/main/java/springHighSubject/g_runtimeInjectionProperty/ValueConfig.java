package springHighSubject.g_runtimeInjectionProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by yangjing on 2017/12/7
 */
@Configuration
public class ValueConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "blankDisc2")
    public BlankDisc blankDisc(@Value("${g.id}") int id, @Value("${g.title}") String title, @Value("${g.artist}") String artist) {
        return new BlankDisc(id, title, artist);
    }

    @Bean(name = "blankDisc3")
    public BlankDisc blankDisc3(@Value("${c.id}") int id, @Value("${c.title}") String title, @Value("${c.artist}") String artist) {
        return new BlankDisc(id, title, artist);
    }
}
