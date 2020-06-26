package com.marlabs.bala.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.bala.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{
	

}
