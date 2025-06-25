package com.example.IdeaForge.repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.IdeaForge.entities.Post;

public interface PostRepository extends MongoRepository<Post, String> {
	Post findPostByUsername(String username);
	List<Post> findByTitle(String title);

}
