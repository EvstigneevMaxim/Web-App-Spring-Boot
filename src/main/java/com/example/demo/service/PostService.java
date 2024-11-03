package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>(List.of(
            new Post((long) 0, "На 2 посте - ложь"),
            new Post((long) 1,"На 1 посте - истина"),
            new Post((long) 2,"А вот теперь думай"),
            new Post((long) 3,"Test", LocalDate.of(2024, 12, 1))
    ));

    public List<Post> listAllPosts() {
        return posts;
    }

    public void addPost(String text) {
        posts.add(new Post((long)posts.size(), text, LocalDate.now()));
    }

    /*public void addPost(Post post){
        posts.add(post);
    }*/

}