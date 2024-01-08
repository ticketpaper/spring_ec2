package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class PostRepository {
    List<Post> posts;

    PostRepository() {
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1, "title1", "body1", "unknown1"));
        this.posts.add(new Post(2, "title2", "body2", "unknown2"));
        this.posts.add(new Post(3, "title3", "body3", "unknown3"));
        this.posts.add(new Post(4, "title4", "body4", "unknown4"));
    }

    List<Post> findAll() {
        return this.posts;
    }
}
