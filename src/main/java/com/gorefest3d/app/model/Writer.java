package main.java.com.gorefest3d.app.model;

import java.util.ArrayList;
import java.util.List;

public class Writer {
    private long id;
    private String name;
    private List<Post> posts = new ArrayList<>();

    public Writer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    @Override
    public String toString() {
        return "Writer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", posts=" + posts.toString() +
                '}';
    }
}
