package main.java.com.gorefest3d.app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Post {
    private long id;
    private String content;
    private List<Tag> tags;
    private PostStatus status;

    public Post(long id, String content, List<Tag> tags, PostStatus status) {
        this.id = id;
        this.content = content;
        this.tags = tags;
        this.status = status;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        for (Tag tag : tags) {
            System.out.println(tag.toString());
        }
        return null;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public PostStatus getStatus() {
        return status;
    }

    public void setStatus(PostStatus status) {
        this.status = status;
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", tags=" + tags.toString() +
                ", status=" + status +
                '}';
    }
}
