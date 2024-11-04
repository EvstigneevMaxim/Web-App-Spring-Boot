package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class PostsCreateController {

    @Autowired
    private PostService postService;

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        List<Post> posts = postService.listAllPosts();
        Long newPostId = (long) posts.size();
        Post newPost = new Post(newPostId, text);
        postService.addPost(text);
        return "redirect:/";
    }
}
