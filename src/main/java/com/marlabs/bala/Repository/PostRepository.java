package com.marlabs.bala.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.bala.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
	

}
