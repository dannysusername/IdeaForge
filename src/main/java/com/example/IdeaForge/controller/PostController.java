package com.example.IdeaForge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.IdeaForge.entities.Post;
import com.example.IdeaForge.repositories.PostRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class PostController {

    //POST, GET, PUT, DELETE methods

    @Autowired
    public PostRepository postRepo;

    @PostMapping("/newPost")
    public String createPost(@RequestBody Post post) {
        postRepo.save(post);
        return "Post added successfully";

    }

    @GetMapping("/Posts")
    public List<Post> getAllPosts(@RequestParam List<Post> getPosts) {
        return postRepo.findAll();
        
    }
    
    
    


    
}
