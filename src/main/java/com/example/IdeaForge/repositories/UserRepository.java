package com.example.IdeaForge.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.IdeaForge.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    
}
