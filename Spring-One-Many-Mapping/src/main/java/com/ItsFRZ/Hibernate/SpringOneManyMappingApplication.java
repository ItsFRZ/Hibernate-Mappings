package com.ItsFRZ.Hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ItsFRZ.Hibernate.Entity.Comment;
import com.ItsFRZ.Hibernate.Entity.Post;
import com.ItsFRZ.Hibernate.Repositories.PostRepository;

@SpringBootApplication
public class SpringOneManyMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringOneManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository pRepository;
	
	
	
	// This method execute whenever we start our spring boot project
	@Override
	public void run(String... args) throws Exception {
		
		Post post = new Post("One To Many Mapping","One To Many Mapping Using JPA and Hibernate");

	
		Comment comment1 = new Comment("Very Usefull ...");
		Comment comment2 = new Comment("Amazing Tutorial");
		Comment comment3 = new Comment("Thanks Buddy ...");
		Comment comment4 = new Comment("Awesome explaination");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		post.getComments().add(comment4);
		
		pRepository.save(post);
		
	
		
		
	
		
	}

}
