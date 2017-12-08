package springHighSubject.g_runtimeInjectionProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangjing on 2017/12/7
 */
@Configuration
@PropertySource("classpath:/test.properties")
@Import(ValueConfig.class)
public class ExpressiveConfig {

    @Autowired
    private Environment env;

    @Autowired
    @Qualifier("blankDisc3")
    private BlankDisc blankDisc3;

    //直接从Environment中检索属性
    @Bean
    public BlankDisc blankDisc() {
        int id = env.getProperty("g.id", Integer.class, 2);
        String title = env.getProperty("g.title");
        String artist = env.getProperty("g.artist");
        List<String> songs = new ArrayList<String>();
        songs.add(env.getProperty("g.song1"));
        songs.add(env.getProperty("g.song2"));
        songs.add(env.getProperty("g.song3"));
        songs.add(env.getProperty("g.song4"));
        songs.add(env.getProperty("g.song5"));
        songs.add(env.getProperty("g.song6"));
        songs.add(env.getProperty("g.song7"));
        songs.add(env.getProperty("g.song8"));
        songs.add(env.getProperty("g.song9"));
        songs.add(env.getProperty("g.song10"));
        return new BlankDisc(id, title, artist, songs);
    }

    @Bean
    public BlankDisc blankDisc3_3() {
        return blankDisc3;
    }
}
