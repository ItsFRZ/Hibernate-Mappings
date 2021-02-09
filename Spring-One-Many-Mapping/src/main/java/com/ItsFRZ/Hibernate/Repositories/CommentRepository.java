package com.ItsFRZ.Hibernate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ItsFRZ.Hibernate.Entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
