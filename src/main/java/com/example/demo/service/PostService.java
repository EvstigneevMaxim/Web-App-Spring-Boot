package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> postList = new ArrayList<>();

        postList.add(new Post("На 2 странице - ложь"));
        postList.add(new Post("На 1 странице - истина"));
        postList.add(new Post("А вот теперь думай"));

        return postList;
    }
}