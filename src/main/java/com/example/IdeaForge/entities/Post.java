package com.example.IdeaForge.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Document("Post")
public class Post {

    @Id
    private String id;

    private String username;
    private String title;
    private String description;

    public Post(String username, String title, String description) {
        
        this.username = username;
        this.title = title;
        this.description = description;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "U: " + this.username + " Title: " + title + " Description: " + description;
        
    }
    
}
