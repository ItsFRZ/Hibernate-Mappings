package com.ItsFRZ.Hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ItsFRZ.Hibernate.Entity.Post;
import com.ItsFRZ.Hibernate.Entity.Tag;
import com.ItsFRZ.Hibernate.Repository.PostRepository;
import com.ItsFRZ.Hibernate.Repository.TagRepository;

@SpringBootApplication
public class SpringManyManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringManyManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository pRepository;



	@Override
	public void run(String... args) throws Exception {

		Post post = new Post("Hibernate Many to Many Mapping",
				"Hibernate Many to Many Mapping example with spring boot and jpa", "Spring boot hibernate tutorials");

		Tag tag1 = new Tag("Spring Boot");
		Tag tag2 = new Tag("Hibernate");
		Tag tag3 = new Tag("Hibernate Tutorials");
		Tag tag4 = new Tag("Spring Many to Many");
		Tag tag5 = new Tag("Hibernate Many to Many");

		post.getTags().add(tag1);
		post.getTags().add(tag2);
		post.getTags().add(tag3);
		post.getTags().add(tag4);
		post.getTags().add(tag5);

		tag1.getPost().add(post);
		tag2.getPost().add(post);
		tag3.getPost().add(post);
		tag4.getPost().add(post);
		tag5.getPost().add(post);

		this.pRepository.save(post);
	}

}
