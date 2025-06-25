package com.example.IdeaForge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.IdeaForge.entities.Post;



@RestController
public class UserController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return mongoTemplate.save(post);
    }
}