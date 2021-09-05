package main.java.com.gorefest3d.app;

import main.java.com.gorefest3d.app.model.Post;
import main.java.com.gorefest3d.app.model.PostStatus;
import main.java.com.gorefest3d.app.model.Tag;
import main.java.com.gorefest3d.app.model.Writer;

public class AppTest {
    public static void main(String[] args) {
        Writer writer = new Writer(100, "Alex");
        Post post = new Post(writer.getId(), "Post1", PostStatus.ACTIVE);
        Post post2 = new Post(writer.getId(), "Post2", PostStatus.ACTIVE);
        Tag tag = new Tag(writer.getId(), "Tag1");
        Tag tag2 = new Tag(writer.getId(), "Tag2");
        Tag tag3 = new Tag(writer.getId(), "Tag3");
        Tag tag4 = new Tag(writer.getId(), "Tag4");
        post.addTag(tag);
        post.addTag(tag2);
        post2.addTag(tag3);
        post2.addTag(tag4);
        writer.addPost(post);
        writer.addPost(post2);

        System.out.println(writer);
    }
}
