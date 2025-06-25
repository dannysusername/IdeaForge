package com.example.IdeaForge.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Post")
public class Post {

    @Id
    String id;

    String username;
    String title;
    String description;

    public Post(String username, String title, String description) {
        
        this.username = username;
        this.title = title;
        this.description = description;

    }

    @Override
    public String toString() {
        return "U: " + this.username + " Title: " + title + " Description: " + description;
        
    }
    
}
