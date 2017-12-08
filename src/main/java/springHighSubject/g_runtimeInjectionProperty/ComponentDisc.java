package springHighSubject.g_runtimeInjectionProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by yangjing on 2017/12/7
 */
@Component
public class ComponentDisc implements Disc {

    @Value("${c.id}")
    private int id;
    @Value("${c.title}")
    private String title;
    @Value("${c.artist}")
    private String artist;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
