package com.ItsFRZ.Hibernate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ItsFRZ.Hibernate.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
