package com.example.IdeaForge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.IdeaForge.entities.Post;
import com.example.IdeaForge.repositories.PostRepository;

@SpringBootApplication
public class IdeaForgeApplication implements CommandLineRunner{

  @Autowired
	private PostRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(IdeaForgeApplication.class, args);
	}

	@Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save a couple of customers
    repository.save(new Post("Alice", "title1", "Fix this"));
    repository.save(new Post("Bob","title2", "Fix this"));

    // fetch all customers
    System.out.println("Customers found with findAll():");
    System.out.println("-------------------------------");
    for (Post post : repository.findAll()) {
      System.out.println(post);
    }
    System.out.println();

    // fetch an individual customer
    System.out.println("Customer found with findByUserName('Alice'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findPostByUsername("Alice"));

    System.out.println("Customers found with findByTitle('title1'):");
    System.out.println("--------------------------------");
    for (Post post : repository.findByTitle("title1")) {
      System.out.println(post);
    }

	}

}
