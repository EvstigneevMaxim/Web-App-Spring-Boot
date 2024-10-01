package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>(List.of(
            new Post("На 2 посте - ложь"),
            new Post("На 1 посте - истина"),
            new Post("А вот теперь думай")
    ));

    public List<Post> listAllPosts() {
        return posts;
    }

    public void addPost(String text) {
        posts.add(new Post(text, new Date()));
    }

}