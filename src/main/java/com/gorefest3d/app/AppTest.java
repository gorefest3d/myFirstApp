package main.java.com.gorefest3d.app;

import main.java.com.gorefest3d.app.model.Post;
import main.java.com.gorefest3d.app.model.PostStatus;
import main.java.com.gorefest3d.app.model.Tag;
import main.java.com.gorefest3d.app.model.Writer;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
    public static void main(String[] args) {
        Writer writer = new Writer(100, "Alex", new ArrayList<>(Arrays.asList(new Post(500, "Post1", new ArrayList<>(Arrays.asList(new Tag(10, "Tag1"), new Tag(10, "Tag2"))), PostStatus.ACTIVE),
                new Post(600, "Post2", new ArrayList<>(Arrays.asList(new Tag(10, "Tag3"), new Tag(10, "Tag4"))), PostStatus.DELETED))));

        System.out.println(writer);
    }
}
