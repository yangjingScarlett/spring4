package springHighSubject.g_runtimeInjectionProperty;

import java.util.List;

/**
 * Created by yangjing on 2017/12/7
 */
public class BlankDisc implements Disc {

    private int id;
    private String title;
    private String artist;
    private List<String> songs;

    public BlankDisc(int id, String title, String artist, List<String> songs) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

    public BlankDisc(int id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
