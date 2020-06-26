package com.marlabs.bala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marlabs.bala.Repository.PostRepository;
import com.marlabs.bala.entity.Post;
import com.marlabs.bala.entity.Tag;

@SpringBootApplication
public class SpringbootMany2ManyMappingApplication implements CommandLineRunner{
	
	@Autowired
    private PostRepository postRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMany2ManyMappingApplication.class, args);
	}
	
    @Override
    public void run(String...args) throws Exception {

        Post post = new Post("Hibernate Many to Many Mapping Example with Spring Boot",
            "Hibernate Many to Many Mapping Example with Spring Boot",
            "Hibernate Many to Many Mapping Example with Spring Boot");

        Post post1 = new Post("Hibernate One to Many Mapping Example with Spring Boot",
            "Hibernate One to Many Mapping Example with Spring Boot",
            "Hibernate One to Many Mapping Example with Spring Boot");

        Tag springBoot = new Tag("SpringBoot");
        Tag hibernate = new Tag("Hibernate");

        // add tag references post
        post.getTags().add(springBoot);
        post.getTags().add(hibernate);

        // add post references tag

        springBoot.getPosts().add(post);
        hibernate.getPosts().add(post);

        springBoot.getPosts().add(post1);
        post1.getTags().add(springBoot);


        this.postRepository.save(post);
        this.postRepository.save(post1);
    }

}
